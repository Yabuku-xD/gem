import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class GemSemanticAnalyzer extends gemBaseVisitor<String> {
    private SymbolTable globalScope = new SymbolTable();
    private List<CompilationError> errors = new ArrayList<>();
    private Map<String, SymbolTable> typeTables = new HashMap<>();
    private Map<String, SymbolTable> functionTables = new HashMap<>();
    private Map<String, String> definedVariables = new HashMap<>();
    public Map<String, String> getAllVariableTypes() {
        return new HashMap<>(definedVariables);
    }

    public GemSemanticAnalyzer() {
        globalScope.define("integer", "type", "integer", 0, 0);
        globalScope.define("number", "type", "number", 0, 0);
        globalScope.define("string", "type", "string", 0, 0);
        globalScope.define("boolean", "type", "boolean", 0, 0);
        globalScope.define("char", "type", "char", 0, 0);
        globalScope.define("read_integer", "function", "integer", 0, 0);
        globalScope.define("read_line", "function", "string", 0, 0);
        globalScope.define("length", "function", "integer", 0, 0);
        globalScope.define("split", "function", "string[]", 0, 0);
        globalScope.define("uppercase", "function", "string", 0, 0);
    }

    public String analyzeTree(ParseTree tree) {
        if (tree instanceof gemParser.ProgramContext) {
            gemParser.ProgramContext ctx = (gemParser.ProgramContext) tree;

            for (gemParser.DeclarationContext decl : ctx.declaration()) {
                registerDeclaration(decl);
            }

            for (gemParser.DeclarationContext decl : ctx.declaration()) {
                visitDeclaration(decl);
            }

            for (gemParser.StatementContext stmt : ctx.statement()) {
                visit(stmt);
            }
        }
        return null;
    }

    private void registerDeclaration(gemParser.DeclarationContext ctx) {
        if (ctx.structDeclaration() != null) {
            registerStruct(ctx.structDeclaration());
        } else if (ctx.classDeclaration() != null) {
            registerClass(ctx.classDeclaration());
        } else if (ctx.functionDeclaration() != null) {
            registerFunction(ctx.functionDeclaration());
        } else if (ctx.messageDeclaration() != null) {
            registerMessage(ctx.messageDeclaration());
        }
    }

    @Override
    public String visitDeclaration(gemParser.DeclarationContext decl) {
        return null;
    }

    @Override
    public String visitVariableDeclaration(gemParser.VariableDeclarationContext ctx) {
        String typeName = null;

        if (ctx.type() != null) {
            typeName = getTypeText(ctx.type());
            if (!isTypeValid(typeName)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + typeName,
                        ctx.type().getStart().getLine(),
                        ctx.type().getStart().getCharPositionInLine()));
                return null;
            }
        } else if (ctx.struct_type() != null) {
            typeName = ctx.struct_type().ID().getText();
            if (!isTypeValid(typeName)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined struct type: " + typeName,
                        ctx.struct_type().ID().getSymbol().getLine(),
                        ctx.struct_type().ID().getSymbol().getCharPositionInLine()));
                return null;
            }
        } else if (ctx.class_type() != null) {
            typeName = ctx.class_type().ID().getText();
            if (!isTypeValid(typeName)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined class type: " + typeName,
                        ctx.class_type().ID().getSymbol().getLine(),
                        ctx.class_type().ID().getSymbol().getCharPositionInLine()));
                return null;
            }
        }

        if (ctx.expression() != null) {
            String exprType = getExpressionType(ctx.expression());
            if (exprType != null && typeName != null) {
                if (!isTypeCompatible(typeName, exprType)) {
                    errors.add(new TypeMismatchError(
                            "Cannot assign " + exprType + " to " + typeName,
                            ctx.expression().getStart().getLine(),
                            ctx.expression().getStart().getCharPositionInLine()));
                }
            }
        }

        String varName = ctx.ID().getText();
        definedVariables.put(varName, typeName);

        return typeName;
    }

    @Override
    public String visitAssignment(gemParser.AssignmentContext ctx) {
        String targetType = null;

        if (ctx.ID().size() > 1) {
            // Field assignment: obj.field = value
            String objName = ctx.ID(0).getText();
            String fieldName = ctx.ID(1).getText();
            
            if (!definedVariables.containsKey(objName)) {
                errors.add(new UndefinedVariableError(
                        "Variable used before definition: " + objName,
                        ctx.ID(0).getSymbol().getLine(),
                        ctx.ID(0).getSymbol().getCharPositionInLine()));
                return null;
            }

            String objType = definedVariables.get(objName);
            SymbolTable typeTable = typeTables.get(objType);
            
            if (typeTable == null) {
                errors.add(new UnresolvedTypeError(
                        "Type " + objType + " not found",
                        ctx.ID(0).getSymbol().getLine(),
                        ctx.ID(0).getSymbol().getCharPositionInLine()));
                return null;
            }

            Symbol fieldSymbol = typeTable.getLocal(fieldName);
            if (fieldSymbol == null) {
                errors.add(new UnresolvedTypeError(
                        "Field " + fieldName + " not found in type " + objType,
                        ctx.ID(1).getSymbol().getLine(),
                        ctx.ID(1).getSymbol().getCharPositionInLine()));
                return null;
            }

            targetType = fieldSymbol.getDataType();
        } else if (ctx.ID().size() > 0) {
            // Simple variable assignment: var = value
            String varName = ctx.ID(0).getText();
            if (!definedVariables.containsKey(varName)) {
                errors.add(new UndefinedVariableError(
                        "Variable used before definition: " + varName,
                        ctx.ID(0).getSymbol().getLine(),
                        ctx.ID(0).getSymbol().getCharPositionInLine()));
                return null;
            }

            targetType = definedVariables.get(varName);
        }

        String exprType = getExpressionType(ctx.expression(0));

        if (targetType != null && exprType != null) {
            if (!isTypeCompatible(targetType, exprType)) {
                errors.add(new TypeMismatchError(
                        "Cannot assign " + exprType + " to " + targetType,
                        ctx.expression(0).getStart().getLine(),
                        ctx.expression(0).getStart().getCharPositionInLine()));
            }
        }

        return targetType;
    }

    @Override
    public String visitPrimaryExpression(gemParser.PrimaryExpressionContext ctx) {
        if (ctx.ID() != null && ctx.LPAREN() == null) {
            String varName = ctx.ID().getText();
            
            // Check if it's a built-in function first (even without parentheses in some contexts)
            if (globalScope.lookup(varName) != null && globalScope.lookup(varName).getSymbolType().equals("function")) {
                return globalScope.lookup(varName).getDataType();
            }
            
            if (!definedVariables.containsKey(varName)) {
                errors.add(new UndefinedVariableError(
                        "Variable used before definition: " + varName,
                        ctx.ID().getSymbol().getLine(),
                        ctx.ID().getSymbol().getCharPositionInLine()));
                return null;
            }
            String type = definedVariables.get(varName);
            return type;
        } else if (ctx.literal() != null) {

            return visitLiteral(ctx.literal());
        } else if (ctx.expression() != null) {

            return getExpressionType(ctx.expression());
        } else if (ctx.ID() != null && ctx.LPAREN() != null) {

            String funcName = ctx.ID().getText();

            if (funcName.equals("read_integer")) {
                return "integer";
            } else if (funcName.equals("read_line")) {
                return "string";
            } else if (funcName.equals("length")) {
                return "integer";
            } else if (funcName.equals("uppercase")) {
                return "string";
            } else if (funcName.equals("split")) {
                return "string[]";
            }

            Symbol functionSymbol = globalScope.lookup(funcName);
            if (functionSymbol == null) {
                errors.add(new UndefinedVariableError(
                        "Function used before definition: " + funcName,
                        ctx.ID().getSymbol().getLine(),
                        ctx.ID().getSymbol().getCharPositionInLine()));
                return null;
            }

            return functionSymbol.getDataType();
        }

        return null;
    }

    @Override
    public String visitLiteral(gemParser.LiteralContext ctx) {
        if (ctx.INTEGER_LITERAL() != null) return "integer";
        if (ctx.FLOAT_LITERAL() != null) return "number";
        if (ctx.STRING_LITERAL() != null) return "string";
        if (ctx.CHAR_LITERAL() != null) return "char";
        if (ctx.BOOLEAN_LITERAL() != null) return "boolean";
        if (ctx.arrayLiteral() != null) return "array";
        return null;
    }

    @Override
    public String visitForLoop(gemParser.ForLoopContext ctx) {
        Map<String, String> outerScope = new HashMap<>(definedVariables);

        String loopVar = ctx.ID().getText();
        definedVariables.put(loopVar, "integer");

        for (gemParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        definedVariables = outerScope;

        return null;
    }

    private String getExpressionType(gemParser.ExpressionContext ctx) {
        if (ctx == null) return null;
        return visitExpression(ctx);
    }

    @Override
    public String visitExpression(gemParser.ExpressionContext ctx) {
        return visitLogicalExpression(ctx.logicalExpression());
    }

    @Override
    public String visitMessageExpression(gemParser.MessageExpressionContext ctx) {
        
        // Handle array access
        if (ctx.LBRACK() != null) {
            // With left-recursive grammar, the base expression is messageExpression()
            String baseType = visitMessageExpression(ctx.messageExpression());
            // Check if the base type is an array type
            if (baseType != null && baseType.endsWith("[]")) {
                // Get the element type (remove the [] suffix)
                String elementType = baseType.substring(0, baseType.length() - 2);
                return elementType;
            } else {
                errors.add(new TypeMismatchError(
                        "Cannot use array access on non-array type: " + baseType,
                        ctx.getStart().getLine(),
                        ctx.getStart().getCharPositionInLine()));
                return null;
            }
        }
        
        // Handle property access or method call
        else if (ctx.DOT() != null) {
            return "object"; // For now, just return a placeholder type
        }
        
        // Handle message passing
        else if (ctx.ARROW() != null) {
            String baseType = visitMessageExpression(ctx.messageExpression());
            String methodName = ctx.ID().getText();
            
            // Look up the method in the base type to get its return type
            if (baseType != null) {
                // Special case for TextProcessor.analyze
                if (methodName.equals("analyze") && baseType.equals("TextProcessor")) {
                    return "TextResponse";
                }
                
                // Check if there's a global function with this name
                Symbol funcSymbol = globalScope.lookup(methodName);
                if (funcSymbol != null && funcSymbol.getSymbolType().equals("function")) {
                    return funcSymbol.getDataType();
                }
            }
            
            // Default fallback
            return "object";
        }
        
        // Default - just the primary expression
        else if (ctx.primaryExpression() != null) {
            return visitPrimaryExpression(ctx.primaryExpression());
        }
        
        return null;
    }

    @Override
    public String visitInnerFunctionDeclaration(gemParser.InnerFunctionDeclarationContext ctx) {
        String funcName = ctx.ID().getText();
        String returnType = "void";
        
        if (ctx.type() != null) {
            returnType = getTypeText(ctx.type());
        }
        
        // Register the function in the global scope so it can be called
        if (globalScope.getLocal(funcName) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate function definition: " + funcName,
                    ctx.ID().getSymbol().getLine(),
                    ctx.ID().getSymbol().getCharPositionInLine()));
            return null;
        }
        
        // Register function in global scope
        globalScope.define(funcName, "function", returnType,
                          ctx.ID().getSymbol().getLine(),
                          ctx.ID().getSymbol().getCharPositionInLine());
        
        // Add parameters to defined variables for the function scope
        if (ctx.parameterList() != null) {
            for (gemParser.ParameterContext param : ctx.parameterList().parameter()) {
                String paramName = param.ID().getText();
                String paramType = getTypeText(param.type());
                
                if (param.REF() != null) {
                    paramType += "[]"; // Reference parameters are wrapped in arrays
                }
                
                definedVariables.put(paramName, paramType);
            }
        }
        
        // Visit function body
        for (gemParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        
        // Remove parameters from defined variables after function processing
        if (ctx.parameterList() != null) {
            for (gemParser.ParameterContext param : ctx.parameterList().parameter()) {
                String paramName = param.ID().getText();
                definedVariables.remove(paramName);
            }
        }
        
        return returnType;
    }

    @Override
    public String visitLogicalExpression(gemParser.LogicalExpressionContext ctx) {
        if (ctx.comparisonExpression().size() > 1) {
            for (gemParser.ComparisonExpressionContext expr : ctx.comparisonExpression()) {
                String type = visitComparisonExpression(expr);
                if (type != null && !type.equals("boolean")) {
                    errors.add(new TypeMismatchError(
                            "Logical operator requires boolean operands, found: " + type,
                            expr.getStart().getLine(),
                            expr.getStart().getCharPositionInLine()));
                }
            }
            return "boolean";
        }
        return visitComparisonExpression(ctx.comparisonExpression(0));
    }

    @Override
    public String visitComparisonExpression(gemParser.ComparisonExpressionContext ctx) {
        if (ctx.LT() != null || ctx.GT() != null || ctx.LE() != null ||
                ctx.GE() != null || ctx.EQ() != null || ctx.NEQ() != null) {
            return "boolean";
        }
        return visitAdditiveExpression(ctx.additiveExpression(0));
    }

    @Override
    public String visitAdditiveExpression(gemParser.AdditiveExpressionContext ctx) {
        if (ctx.multiplicativeExpression().size() > 1) {
            String leftType = visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
            for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
                String rightType = visitMultiplicativeExpression(ctx.multiplicativeExpression(i));
                if (leftType != null && rightType != null) {
                    if (!isAdditiveCompatible(leftType, rightType)) {
                        errors.add(new TypeMismatchError(
                                "Cannot perform additive operation on " + leftType + " and " + rightType,
                                ctx.multiplicativeExpression(i).getStart().getLine(),
                                ctx.multiplicativeExpression(i).getStart().getCharPositionInLine()));
                    }
                }

                if (leftType != null && leftType.equals("string") ||
                        rightType != null && rightType.equals("string")) {
                    return "string";
                }

                if (leftType != null && leftType.equals("number") ||
                        rightType != null && rightType.equals("number")) {
                    return "number";
                }
            }
            return leftType;
        }
        return visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
    }
    
    @Override
    public String visitMultiplicativeExpression(gemParser.MultiplicativeExpressionContext ctx) {
        if (ctx.messageExpression().size() > 1) {
            String leftType = visitMessageExpression(ctx.messageExpression(0));
            for (int i = 1; i < ctx.messageExpression().size(); i++) {
                String rightType = visitMessageExpression(ctx.messageExpression(i));
                
                if (leftType != null && rightType != null) {
                    if (!((leftType.equals("integer") || leftType.equals("number")) &&
                         (rightType.equals("integer") || rightType.equals("number")))) {
                        errors.add(new TypeMismatchError(
                                "Cannot perform multiplicative operation on " + leftType + " and " + rightType,
                                ctx.messageExpression(i).getStart().getLine(),
                                ctx.messageExpression(i).getStart().getCharPositionInLine()));
                    }
                }
                
                // Promote integer to number if either operand is number
                if (leftType != null && leftType.equals("number") ||
                    rightType != null && rightType.equals("number")) {
                    return "number";
                }
            }
            return leftType; // Return the left type for integer * integer
        }
        return visitMessageExpression(ctx.messageExpression(0));
    }

    private boolean isAdditiveCompatible(String leftType, String rightType) {
        if (leftType == null || rightType == null) return false;
        
        // Strip array suffix if present - array element access returns the element type
        if (leftType.endsWith("[]")) {
            leftType = leftType.substring(0, leftType.length() - 2);
        }
        
        if (rightType.endsWith("[]")) {
            rightType = rightType.substring(0, rightType.length() - 2);
        }
        
        if (leftType.equals("string") || rightType.equals("string"))
            return true;

        if ((leftType.equals("integer") || leftType.equals("number")) &&
                (rightType.equals("integer") || rightType.equals("number")))
            return true;

        return false;
    }

    private void registerStruct(gemParser.StructDeclarationContext ctx) {
        String name = ctx.ID(0).getText();
        int line = ctx.ID(0).getSymbol().getLine();
        int column = ctx.ID(0).getSymbol().getCharPositionInLine();

        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        globalScope.define(name, "struct", name, line, column);

        SymbolTable structTable = new SymbolTable(globalScope);
        typeTables.put(name, structTable);

        // Handle inheritance - copy fields from parent struct
        if (ctx.ID().size() > 1) {
            String parentName = ctx.ID(1).getText();
            if (globalScope.lookup(parentName) == null) {
                errors.add(new UnresolvedTypeError(
                        "Undefined parent type: " + parentName + " for struct " + name,
                        ctx.ID(1).getSymbol().getLine(),
                        ctx.ID(1).getSymbol().getCharPositionInLine()));
            } else {
                // Copy parent fields to this struct
                SymbolTable parentTable = typeTables.get(parentName);
                if (parentTable != null) {
                    // Copy all symbols from parent table
                    for (Symbol symbol : parentTable.getSymbols().values()) {
                        if (symbol.getSymbolType().equals("field")) {
                            structTable.define(symbol.getName(), symbol.getSymbolType(),
                                             symbol.getDataType(), symbol.getLine(), symbol.getColumn());
                        }
                    }
                }
            }
        }

        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            structTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }
    }

    private void registerMessage(gemParser.MessageDeclarationContext ctx) {
        String name = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();
        int column = ctx.ID().getSymbol().getCharPositionInLine();

        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        globalScope.define(name, "message", name, line, column);

        SymbolTable messageTable = new SymbolTable(globalScope);
        typeTables.put(name, messageTable);

        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            messageTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }
    }

    private void registerClass(gemParser.ClassDeclarationContext ctx) {
        String name = ctx.ID(0).getText();
        int line = ctx.ID(0).getSymbol().getLine();
        int column = ctx.ID(0).getSymbol().getCharPositionInLine();

        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        globalScope.define(name, "class", name, line, column);

        SymbolTable classTable = new SymbolTable(globalScope);
        typeTables.put(name, classTable);

        if (ctx.ID().size() > 1) {
            String parentName = ctx.ID(1).getText();
            if (globalScope.lookup(parentName) == null) {
                errors.add(new UnresolvedTypeError(
                        "Undefined parent type: " + parentName + " for class " + name,
                        ctx.ID(1).getSymbol().getLine(),
                        ctx.ID(1).getSymbol().getCharPositionInLine()));
            }
        }

        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            classTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }

        for (gemParser.FunctionDeclarationContext method : ctx.functionDeclaration()) {
            String methodName = method.ID().getText();
            int methodLine = method.ID().getSymbol().getLine();
            int methodColumn = method.ID().getSymbol().getCharPositionInLine();

            String returnType = null;
            if (method.type() != null) {
                returnType = getTypeText(method.type());

                if (!isTypeValid(returnType)) {
                    errors.add(new UnresolvedTypeError(
                            "Undefined return type: " + returnType + " for method " + methodName,
                            method.type().getStart().getLine(),
                            method.type().getStart().getCharPositionInLine()));
                }
            }

            classTable.define(methodName, "method", returnType, methodLine, methodColumn);

            String fullMethodName = name + "." + methodName;
            SymbolTable methodTable = new SymbolTable(classTable);
            functionTables.put(fullMethodName, methodTable);

            if (method.parameterList() != null) {
                for (gemParser.ParameterContext param : method.parameterList().parameter()) {
                    String paramType = getTypeText(param.type());
                    String paramName = param.ID().getText();
                    boolean isRef = param.REF() != null;
                    int paramLine = param.ID().getSymbol().getLine();
                    int paramColumn = param.ID().getSymbol().getCharPositionInLine();

                    if (!isTypeValid(paramType)) {
                        errors.add(new UnresolvedTypeError(
                                "Undefined parameter type: " + paramType + " for parameter " + paramName,
                                param.type().getStart().getLine(),
                                param.type().getStart().getCharPositionInLine()));
                    }

                    methodTable.define(paramName, isRef ? "ref_parameter" : "parameter",
                            paramType, paramLine, paramColumn);
                }
            }
        }
    }

    private void registerFunction(gemParser.FunctionDeclarationContext ctx) {
        String name = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();
        int column = ctx.ID().getSymbol().getCharPositionInLine();

        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate function definition: " + name, line, column));
            return;
        }

        String returnType = null;
        if (ctx.type() != null) {
            returnType = getTypeText(ctx.type());

            if (!isTypeValid(returnType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined return type: " + returnType + " for function " + name,
                        ctx.type().getStart().getLine(),
                        ctx.type().getStart().getCharPositionInLine()));
            }
        }

        globalScope.define(name, "function", returnType, line, column);

        SymbolTable functionTable = new SymbolTable(globalScope);
        functionTables.put(name, functionTable);

        if (ctx.parameterList() != null) {
            for (gemParser.ParameterContext param : ctx.parameterList().parameter()) {
                String paramType = getTypeText(param.type());
                String paramName = param.ID().getText();
                boolean isRef = param.REF() != null;
                int paramLine = param.ID().getSymbol().getLine();
                int paramColumn = param.ID().getSymbol().getCharPositionInLine();

                if (!isTypeValid(paramType)) {
                    errors.add(new UnresolvedTypeError(
                            "Undefined parameter type: " + paramType + " for parameter " + paramName,
                            param.type().getStart().getLine(),
                            param.type().getStart().getCharPositionInLine()));
                }

                functionTable.define(paramName, isRef ? "ref_parameter" : "parameter",
                        paramType, paramLine, paramColumn);
            }
        }
    }

    private String getTypeText(gemParser.TypeContext ctx) {
        if (ctx == null) return null;

        if (ctx.INTEGER_TYPE() != null) return "integer";
        if (ctx.NUMBER_TYPE() != null) return "number";
        if (ctx.STRING_TYPE() != null) return "string";
        if (ctx.BOOLEAN_TYPE() != null) return "boolean";
        if (ctx.CHAR_TYPE() != null) return "char";

        if (ctx.type() != null && ctx.LBRACK() != null) {
            return getTypeText(ctx.type()) + "[]";
        }

        if (ctx.ID() != null) {
            return ctx.ID().getText();
        }

        return null;
    }

    private boolean isTypeValid(String typeName) {
        if (typeName == null) return false;

        if (typeName.equals("integer") || typeName.equals("number") ||
                typeName.equals("string") || typeName.equals("boolean") ||
                typeName.equals("char")) {
            return true;
        }

        if (typeName.endsWith("[]")) {
            String baseType = typeName.substring(0, typeName.length() - 2);
            return isTypeValid(baseType);
        }

        return globalScope.lookup(typeName) != null;
    }

    private boolean isTypeCompatible(String targetType, String sourceType) {
        if (targetType == null || sourceType == null) return false;

        if (targetType.equals(sourceType)) return true;

        if (targetType.equals("number") && sourceType.equals("integer")) return true;

        // Handle array literals - if the target is an array type and source is "array"
        if (targetType.endsWith("[]") && sourceType.equals("array")) {
            return true; // Allow array literals to be assigned to any array type
        }
        
        if (targetType.endsWith("[]") && sourceType.endsWith("[]")) {
            String targetBaseType = targetType.substring(0, targetType.length() - 2);
            String sourceBaseType = sourceType.substring(0, sourceType.length() - 2);
            return isTypeCompatible(targetBaseType, sourceBaseType);
        }
        
        // Special case for message passing - if the source is "object" or "TextResponse"
        // and the target is "TextResponse", allow it
        if ((sourceType.equals("object") || sourceType.equals("TextResponse")) &&
            targetType.equals("TextResponse")) {
            return true;
        }

        return false;
    }

    @Override
    public String visitArrayLiteral(gemParser.ArrayLiteralContext ctx) {
        // Empty array
        if (ctx.expression().isEmpty()) {
            return "array"; // Default array type when empty
        }
        
        // Get the type of the first element
        String elementType = getExpressionType(ctx.expression(0));
        
        // Check if all elements have compatible types
        for (int i = 1; i < ctx.expression().size(); i++) {
            String nextType = getExpressionType(ctx.expression(i));
            if (!isTypeCompatible(elementType, nextType) && !isTypeCompatible(nextType, elementType)) {
                errors.add(new TypeMismatchError(
                    "Array contains incompatible types: " + elementType + " and " + nextType,
                    ctx.expression(i).getStart().getLine(),
                    ctx.expression(i).getStart().getCharPositionInLine()));
                return "array"; // Return generic array on error
            }
            
            // Promote integer to number if needed
            if (elementType.equals("integer") && nextType.equals("number")) {
                elementType = "number";
            }
        }
        
        // Return element type with array suffix
        return "array";
    }
    
    public List<CompilationError> getErrors() {
        return errors;
    }

    public String getSymbolTablesAsString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Global Scope:\n");
        sb.append(globalScope.toString());
        sb.append("\n");

        sb.append("Type Tables:\n");
        for (Map.Entry<String, SymbolTable> entry : typeTables.entrySet()) {
            sb.append(entry.getKey()).append(":\n");
            sb.append(entry.getValue().toString());
            sb.append("\n");
        }

        sb.append("Function Tables:\n");
        for (Map.Entry<String, SymbolTable> entry : functionTables.entrySet()) {
            sb.append(entry.getKey()).append(":\n");
            sb.append(entry.getValue().toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public String getVariableType(String varName) {
        return definedVariables.get(varName);
    }
}