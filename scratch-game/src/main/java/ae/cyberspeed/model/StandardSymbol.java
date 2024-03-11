package ae.cyberspeed.model;


import com.fasterxml.jackson.annotation.*;

import java.util.*;

public class StandardSymbol extends Symbol {
    private int intValue;

    private List<WinCombination> winCombinations;

    @JsonCreator
    public StandardSymbol(@JsonProperty("reward_multiplier") double rewardMultiplier,
                          @JsonProperty("type") SymbolType type) {
      super(type, rewardMultiplier);
    }

    @JsonCreator
    public StandardSymbol(@JsonProperty int intValue) {
        super(null,0);
        this.intValue = intValue;
    }

    public StandardSymbol(List<WinCombination> winCombinations) {
        super(null,0);
        this.winCombinations = winCombinations;
    }

    public int getIntValue() {
        return intValue;
    }

    public List<WinCombination> getWinCombinations() {
        return winCombinations;
    }
}
