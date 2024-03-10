package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

public class WinCombination extends Combination {


    @JsonCreator
    public WinCombination(@JsonProperty("reward_multiplier") double rewardMultiplier,
                          @JsonProperty("when") String when,
                          @JsonProperty("count") int count,
                          @JsonProperty("group") String group,
                          @JsonProperty("covered_areas")List<List<String>> coveredAreas) {
        super(rewardMultiplier, when, count, group, coveredAreas);
    }


}
