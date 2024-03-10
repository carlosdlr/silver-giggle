package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class ProbabilityStandardSymbol {

    private int column;
    private int row;

    private Symbols symbols;

    @JsonCreator
    public ProbabilityStandardSymbol(@JsonProperty("column") int column, @JsonProperty("row") int row,
                                    @JsonProperty("symbols") Symbols symbols) {
        this.column = column;
        this.row = row;
        this.symbols = symbols;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public Symbols getSymbols() {
        return symbols;
    }
}
