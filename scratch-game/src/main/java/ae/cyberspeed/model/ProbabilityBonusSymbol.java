package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class ProbabilityBonusSymbol {

    private Symbols symbols;

    @JsonCreator
    public ProbabilityBonusSymbol(@JsonProperty("symbols") Symbols symbols) {
        this.symbols = symbols;
    }

    public Symbols getSymbols() {
        return symbols;
    }
}
