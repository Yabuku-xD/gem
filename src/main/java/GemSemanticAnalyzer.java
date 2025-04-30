import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class GemSemanticAnalyzer extends gemBaseVisitor<String> {
    private SymbolTable globalScope = new SymbolTable();
    private SymbolTable currentScope = globalScope;
    private List<CompilationError> errors = new ArrayList<>();

    // Symbol tables for types and functions
    private Map<String, SymbolTable> typeTables = new HashMap<>();
    private Map<String, SymbolTable> functionTables = new HashMap<>();

    // Track variables defined in the current scope
    private Map<String, String> definedVariables = new HashMap<>();

    public GemSemanticAnalyzer() {
        // Initialize with built-in types
        globalScope.define("integer", "type", "integer", 0, 0);
        globalScope.define("number", "type", "number", 0, 0);
        globalScope.define("string", "type", "string", 0, 0);
        globalScope.define("boolean", "type", "boolean", 0, 0);
        globalScope.define("char", "type", "char", 0, 0);
    }

    public String analyzeTree(ParseTree tree) {
        // First pass: Register all types and function signatures
        if (tree instanceof gemParser.ProgramContext) {
            gemParser.ProgramContext ctx = (gemParser.ProgramContext) tree;

            // Register declarations
            for (gemParser.DeclarationContext decl : ctx.declaration()) {
                registerDeclaration(decl);
            }

            // Analyze declarations
            for (gemParser.DeclarationContext decl : ctx.declaration()) {
                visitDeclaration(decl);
            }

            // Analyze statements
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
        } else if (ctx.messageDeclaration() != null) {
            registerMessage(ctx.messageDeclaration());
        } else if (ctx.functionDeclaration() != null) {
            registerFunction(ctx.functionDeclaration());
        }
    }

    @Override
    public String visitDeclaration(gemParser.DeclarationContext decl) {
        // Implementation details for analyzing declarations
        return null;
    }

    @Override
    public String visitVariableDeclaration(gemParser.VariableDeclarationContext ctx) {
        // Check variable type
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
        } else if (ctx.message_type() != null) {
            typeName = ctx.message_type().ID().getText();
            if (!isTypeValid(typeName)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined message type: " + typeName,
                        ctx.message_type().ID().getSymbol().getLine(),
                        ctx.message_type().ID().getSymbol().getCharPositionInLine()));
                return null;
            }
        }

        // Check initialization value if present
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

        // Register the variable in current scope
        String varName = ctx.ID().getText();
        definedVariables.put(varName, typeName);

        return typeName;
    }

    @Override
    public String visitAssignment(gemParser.AssignmentContext ctx) {
        String targetType = null;

        // Check if variable is defined
        if (ctx.ID().size() > 0) {
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

        // Check expression type
        String exprType = getExpressionType(ctx.expression(0));

        // Check type compatibility
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
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (!definedVariables.containsKey(varName)) {
                errors.add(new UndefinedVariableError(
                        "Variable used before definition: " + varName,
                        ctx.ID().getSymbol().getLine(),
                        ctx.ID().getSymbol().getCharPositionInLine()));
                return null;
            }
            return definedVariables.get(varName);
        } else if (ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        } else if (ctx.expression() != null) {
            return getExpressionType(ctx.expression());
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

    private String getExpressionType(gemParser.ExpressionContext ctx) {
        if (ctx == null) return null;
        return visitExpression(ctx);
    }

    @Override
    public String visitExpression(gemParser.ExpressionContext ctx) {
        return visitLogicalExpression(ctx.logicalExpression());
    }

    @Override
    public String visitLogicalExpression(gemParser.LogicalExpressionContext ctx) {
        if (ctx.AND() != null || ctx.OR() != null) {
            // Check that both operands are boolean
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
            // Comparison operators result in boolean
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

                // Check type compatibility for addition/subtraction
                if (leftType != null && rightType != null) {
                    if (!isAdditiveCompatible(leftType, rightType)) {
                        errors.add(new TypeMismatchError(
                                "Cannot perform additive operation on " + leftType + " and " + rightType,
                                ctx.multiplicativeExpression(i).getStart().getLine(),
                                ctx.multiplicativeExpression(i).getStart().getCharPositionInLine()));
                    }
                }

                // String concatenation results in string
                if (leftType != null && leftType.equals("string") ||
                        rightType != null && rightType.equals("string")) {
                    return "string";
                }

                // Numeric operations result in number or integer
                if (leftType != null && leftType.equals("number") ||
                        rightType != null && rightType.equals("number")) {
                    return "number";
                }
            }
            return leftType;
        }
        return visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
    }

    private boolean isAdditiveCompatible(String leftType, String rightType) {
        // String concatenation
        if (leftType.equals("string") || rightType.equals("string"))
            return true;

        // Numeric operations
        if ((leftType.equals("integer") || leftType.equals("number")) &&
                (rightType.equals("integer") || rightType.equals("number")))
            return true;

        return false;
    }

    private void registerStruct(gemParser.StructDeclarationContext ctx) {
        String name = ctx.ID(0).getText();
        int line = ctx.ID(0).getSymbol().getLine();
        int column = ctx.ID(0).getSymbol().getCharPositionInLine();

        // Check for duplicate type definition
        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        // Register the struct
        globalScope.define(name, "struct", name, line, column);

        // Create symbol table for struct
        SymbolTable structTable = new SymbolTable(globalScope);
        typeTables.put(name, structTable);

        // Handle inheritance if specified
        if (ctx.ID().size() > 1) {
            String parentName = ctx.ID(1).getText();
            if (globalScope.lookup(parentName) == null) {
                errors.add(new UnresolvedTypeError(
                        "Undefined parent type: " + parentName + " for struct " + name,
                        ctx.ID(1).getSymbol().getLine(),
                        ctx.ID(1).getSymbol().getCharPositionInLine()));
            }
        }

        // Register fields
        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            // Check field type
            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            // Register field
            structTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }
    }

    private void registerClass(gemParser.ClassDeclarationContext ctx) {
        String name = ctx.ID(0).getText();
        int line = ctx.ID(0).getSymbol().getLine();
        int column = ctx.ID(0).getSymbol().getCharPositionInLine();

        // Check for duplicate type definition
        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        // Register the class
        globalScope.define(name, "class", name, line, column);

        // Create symbol table for class
        SymbolTable classTable = new SymbolTable(globalScope);
        typeTables.put(name, classTable);

        // Handle inheritance if specified
        if (ctx.ID().size() > 1) {
            String parentName = ctx.ID(1).getText();
            if (globalScope.lookup(parentName) == null) {
                errors.add(new UnresolvedTypeError(
                        "Undefined parent type: " + parentName + " for class " + name,
                        ctx.ID(1).getSymbol().getLine(),
                        ctx.ID(1).getSymbol().getCharPositionInLine()));
            }
        }

        // Register fields
        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            // Check field type
            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            // Register field
            classTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }

        // Register methods
        for (gemParser.FunctionDeclarationContext method : ctx.functionDeclaration()) {
            String methodName = method.ID().getText();
            int methodLine = method.ID().getSymbol().getLine();
            int methodColumn = method.ID().getSymbol().getCharPositionInLine();

            // Get return type if specified
            String returnType = null;
            if (method.type() != null) {
                returnType = getTypeText(method.type());

                // Check return type
                if (!isTypeValid(returnType)) {
                    errors.add(new UnresolvedTypeError(
                            "Undefined return type: " + returnType + " for method " + methodName,
                            method.type().getStart().getLine(),
                            method.type().getStart().getCharPositionInLine()));
                }
            }

            // Register method in class symbol table
            classTable.define(methodName, "method", returnType, methodLine, methodColumn);

            // Create method symbol table
            String fullMethodName = name + "." + methodName;
            SymbolTable methodTable = new SymbolTable(classTable);
            functionTables.put(fullMethodName, methodTable);

            // Register method parameters
            if (method.parameterList() != null) {
                for (gemParser.ParameterContext param : method.parameterList().parameter()) {
                    String paramType = getTypeText(param.type());
                    String paramName = param.ID().getText();
                    boolean isRef = param.REF() != null;
                    int paramLine = param.ID().getSymbol().getLine();
                    int paramColumn = param.ID().getSymbol().getCharPositionInLine();

                    // Check parameter type
                    if (!isTypeValid(paramType)) {
                        errors.add(new UnresolvedTypeError(
                                "Undefined parameter type: " + paramType + " for parameter " + paramName,
                                param.type().getStart().getLine(),
                                param.type().getStart().getCharPositionInLine()));
                    }

                    // Register parameter
                    methodTable.define(paramName, isRef ? "ref_parameter" : "parameter",
                            paramType, paramLine, paramColumn);
                }
            }
        }
    }

    private void registerMessage(gemParser.MessageDeclarationContext ctx) {
        String name = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();
        int column = ctx.ID().getSymbol().getCharPositionInLine();

        // Check for duplicate type definition
        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate type definition: " + name, line, column));
            return;
        }

        // Register the message
        globalScope.define(name, "message", name, line, column);

        // Create symbol table for message
        SymbolTable messageTable = new SymbolTable(globalScope);
        typeTables.put(name, messageTable);

        // Register fields
        for (gemParser.FieldContext field : ctx.field()) {
            String fieldType = getTypeText(field.type());
            String fieldName = field.ID().getText();
            int fieldLine = field.ID().getSymbol().getLine();
            int fieldColumn = field.ID().getSymbol().getCharPositionInLine();

            // Check field type
            if (!isTypeValid(fieldType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined type: " + fieldType + " for field " + fieldName,
                        field.type().getStart().getLine(),
                        field.type().getStart().getCharPositionInLine()));
            }

            // Register field
            messageTable.define(fieldName, "field", fieldType, fieldLine, fieldColumn);
        }
    }

    private void registerFunction(gemParser.FunctionDeclarationContext ctx) {
        String name = ctx.ID().getText();
        int line = ctx.ID().getSymbol().getLine();
        int column = ctx.ID().getSymbol().getCharPositionInLine();

        // Check for duplicate function definition
        if (globalScope.getLocal(name) != null) {
            errors.add(new DuplicateTypeError(
                    "Duplicate function definition: " + name, line, column));
            return;
        }

        // Get return type if specified
        String returnType = null;
        if (ctx.type() != null) {
            returnType = getTypeText(ctx.type());

            // Check return type
            if (!isTypeValid(returnType)) {
                errors.add(new UnresolvedTypeError(
                        "Undefined return type: " + returnType + " for function " + name,
                        ctx.type().getStart().getLine(),
                        ctx.type().getStart().getCharPositionInLine()));
            }
        }

        // Register function
        globalScope.define(name, "function", returnType, line, column);

        // Create function symbol table
        SymbolTable functionTable = new SymbolTable(globalScope);
        functionTables.put(name, functionTable);

        // Register parameters
        if (ctx.parameterList() != null) {
            for (gemParser.ParameterContext param : ctx.parameterList().parameter()) {
                String paramType = getTypeText(param.type());
                String paramName = param.ID().getText();
                boolean isRef = param.REF() != null;
                int paramLine = param.ID().getSymbol().getLine();
                int paramColumn = param.ID().getSymbol().getCharPositionInLine();

                // Check parameter type
                if (!isTypeValid(paramType)) {
                    errors.add(new UnresolvedTypeError(
                            "Undefined parameter type: " + paramType + " for parameter " + paramName,
                            param.type().getStart().getLine(),
                            param.type().getStart().getCharPositionInLine()));
                }

                // Register parameter
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

        // Built-in types
        if (typeName.equals("integer") || typeName.equals("number") ||
                typeName.equals("string") || typeName.equals("boolean") ||
                typeName.equals("char")) {
            return true;
        }

        // Array types
        if (typeName.endsWith("[]")) {
            String baseType = typeName.substring(0, typeName.length() - 2);
            return isTypeValid(baseType);
        }

        // User-defined types - check if registered in global scope
        return globalScope.lookup(typeName) != null;
    }

    private boolean isTypeCompatible(String targetType, String sourceType) {
        if (targetType == null || sourceType == null) return false;

        // Same type
        if (targetType.equals(sourceType)) return true;

        // Special case: integer can be assigned to number
        if (targetType.equals("number") && sourceType.equals("integer")) return true;

        // Array types
        if (targetType.endsWith("[]") && sourceType.endsWith("[]")) {
            String targetBaseType = targetType.substring(0, targetType.length() - 2);
            String sourceBaseType = sourceType.substring(0, sourceType.length() - 2);
            return isTypeCompatible(targetBaseType, sourceBaseType);
        }

        return false;
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
}