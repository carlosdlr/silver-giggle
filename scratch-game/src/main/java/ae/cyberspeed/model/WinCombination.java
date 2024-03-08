package ae.cyberspeed.model;

import java.util.*;

public class WinCombination extends Combination {
    public WinCombination(double rewardMultiplier, String when, int count,
                          String group, List<String> coveredAreas) {
        super(rewardMultiplier, when, count, group, coveredAreas);
    }
}
