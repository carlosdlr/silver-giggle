package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class Configuration {

    private int columns;
    private int rows;
    private Symbols symbols;
    private Probabilities probabilities;
    private WinCombinations winCombinations;

    @JsonCreator
    public Configuration(@JsonProperty("columns") int columns,
                         @JsonProperty("rows") int rows,
                         @JsonProperty("symbols") Symbols symbols,
                         @JsonProperty("probabilities") Probabilities probabilities,
                         @JsonProperty("win_combinations") WinCombinations winCombinations) {
        this.columns = columns;
        this.rows = rows;
        this.symbols = symbols;
        this.probabilities = probabilities;
        this.winCombinations = winCombinations;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public Probabilities getProbabilities() {
        return probabilities;
    }

    public WinCombinations getWinCombinations() {
        return winCombinations;
    }
}
