package ae.cyberspeed.model;

public abstract class Symbol {

    private SymbolType type;
    private double rewardMultiplier;

    private String name;

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

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
