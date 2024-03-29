package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

public abstract class Combination {

    private double rewardMultiplier;
    private String when;
    private int count;
    private String group;
    @JsonIgnoreProperties
    private List<List<String>> coveredAreas;

    private String name;

    protected Combination(double rewardMultiplier, String when, int count,
                       String group, List<List<String>> coveredAreas) {
        this.rewardMultiplier = rewardMultiplier;
        this.when = when;
        this.count = count;
        this.group = group;
        this.coveredAreas = coveredAreas;
    }

    public double getRewardMultiplier() {
        return rewardMultiplier;
    }

    public String getWhen() {
        return when;
    }

    public int getCount() {
        return count;
    }

    protected String getGroup() {
        return group;
    }

    protected List<List<String>> getCoveredAreas() {
        return coveredAreas;
    }

    public String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
}
