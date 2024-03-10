package ae.cyberspeed.model;


import com.fasterxml.jackson.annotation.*;

public class StandardSymbol extends Symbol {
    private int intValue;

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

    public int getIntValue() {
        return intValue;
    }
}
