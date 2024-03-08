package ae.cyberspeed.model;


import com.fasterxml.jackson.annotation.*;

public class StandardSymbol extends Symbol {

    @JsonCreator
    public StandardSymbol(@JsonProperty("reward_multiplier") double rewardMultiplier,
                          @JsonProperty("type") SymbolType type) {
      super(type, rewardMultiplier);
    }
}
