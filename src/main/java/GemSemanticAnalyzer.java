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

    // Changed to return String instead of void to match the ParseTreeVisitor interface
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

    // Changed to public to match the gemVisitor interface
    @Override
    public String visitDeclaration(gemParser.DeclarationContext decl) {
        // Implementation details for analyzing declarations
        // This includes analyzing function/method bodies
        return null;
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
        for (gemParser.MethodContext method : ctx.method()) {
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