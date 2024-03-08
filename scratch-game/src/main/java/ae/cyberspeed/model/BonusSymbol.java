package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

import java.util.function.*;

public class BonusSymbol extends Symbol {

    private double extra;
    private String impact;

    @JsonCreator
    public BonusSymbol(@JsonProperty("reward_multiplier") double rewardMultiplier,
                       @JsonProperty("type") SymbolType type,
                       @JsonProperty("extra") double extra,
                       @JsonProperty("impact") String impact) {
        super(type, rewardMultiplier);
        this.extra = extra;
        this.impact = impact;
    }

    public double getExtra() {
        return extra;
    }

    public String getImpact() {
        return impact;
    }

    public double applyAction(Function<Double, Double> action) {
        return action.apply(this.extra);
    }
}
