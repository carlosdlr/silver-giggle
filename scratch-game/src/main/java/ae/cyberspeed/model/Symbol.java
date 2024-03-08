package ae.cyberspeed.model;

public abstract class Symbol {

    private SymbolType type;
    private double rewardMultiplier;

    protected Symbol(SymbolType type, double rewardMultiplier) {
        this.type = type;
        this.rewardMultiplier = rewardMultiplier;
    }

    protected double getRewardMultiplier() {
        return rewardMultiplier;
    }

    protected SymbolType getType() {
        return type;
    }



}
