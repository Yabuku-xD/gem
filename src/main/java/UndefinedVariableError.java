public class UndefinedVariableError extends CompilationError {
    public UndefinedVariableError(String message, int line, int column) {
        super(message, line, column);
    }
}