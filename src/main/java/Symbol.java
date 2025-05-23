public class Symbol {
    private final String name;
    private final String symbolType;
    private final String dataType;
    private boolean defined;
    private final int line;
    private final int column;

    public Symbol(String name, String symbolType, String dataType, boolean defined, int line, int column) {
        this.name = name;
        this.symbolType = symbolType;
        this.dataType = dataType;
        this.defined = defined;
        this.line = line;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public String getSymbolType() {
        return symbolType;
    }

    public String getDataType() {
        return dataType;
    }

    public boolean isDefined() {
        return defined;
    }

    public void setDefined(boolean defined) {
        this.defined = defined;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return name + " (" + symbolType +
                (dataType != null ? ", " + dataType : "") +
                ", " + (defined ? "defined" : "declared") +
                ") at " + line + ":" + column;
    }
}