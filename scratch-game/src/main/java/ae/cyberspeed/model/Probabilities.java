package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

public class Probabilities {

    private List<ProbabilityStandardSymbol> standardSymbols;
    private ProbabilityBonusSymbol bonusSymbols;

    @JsonCreator
    public Probabilities(@JsonProperty("standard_symbols") List<ProbabilityStandardSymbol> standardSymbols) {
        this.standardSymbols = standardSymbols;
    }

    public List<ProbabilityStandardSymbol> getStandardSymbols() {
        return standardSymbols;
    }

    public ProbabilityBonusSymbol getBonusSymbols() {
        return bonusSymbols;
    }
}

