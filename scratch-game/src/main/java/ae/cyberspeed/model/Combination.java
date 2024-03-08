package ae.cyberspeed.model;

import java.util.*;

public abstract class Combination {

    private double rewardMultiplier;
    private String when;
    private int count;
    private String group;

    private List<String> coveredAreas;

    protected Combination(double rewardMultiplier, String when, int count,
                       String group, List<String> coveredAreas) {
        this.rewardMultiplier = rewardMultiplier;
        this.when = when;
        this.count = count;
        this.group = group;
        this.coveredAreas = coveredAreas;
    }

    protected double getRewardMultiplier() {
        return rewardMultiplier;
    }

    protected String getWhen() {
        return when;
    }

    protected int getCount() {
        return count;
    }

    protected String getGroup() {
        return group;
    }

    protected List<String> getCoveredAreas() {
        return coveredAreas;
    }
}
