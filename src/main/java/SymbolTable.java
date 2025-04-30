import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final SymbolTable parent;
    private final Map<String, Symbol> symbols = new HashMap<>();

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public SymbolTable() {
        this(null);
    }

    public void define(String name, String symbolType, String dataType, int line, int column) {
        symbols.put(name, new Symbol(name, symbolType, dataType, true, line, column));
    }

    public void declare(String name, String symbolType, String dataType, int line, int column) {
        symbols.put(name, new Symbol(name, symbolType, dataType, false, line, column));
    }

    public Symbol lookup(String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }

        if (parent != null) {
            return parent.lookup(name);
        }

        return null;
    }

    public Symbol getLocal(String name) {
        return symbols.get(name);
    }

    public Map<String, Symbol> getSymbols() {
        return new HashMap<>(symbols);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol symbol : symbols.values()) {
            sb.append("  ").append(symbol).append("\n");
        }
        return sb.toString();
    }
}