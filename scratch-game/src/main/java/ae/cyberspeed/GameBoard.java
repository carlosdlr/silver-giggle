package ae.cyberspeed;

import ae.cyberspeed.model.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;

public class GameBoard {

    private List<List<Symbol>> matrix;

    private double reward;

    @JsonProperty("applied_winning_combinations")
    private AppliedWinningCombinations appliedWinningCombinations;

    @JsonProperty("applied_bonus_symbol")
    private BonusSymbol appliedBonusSymbol;

    public GameBoard(List<List<Symbol>> matrix,
                     double reward,
                     AppliedWinningCombinations appliedWinningCombinations,
                     BonusSymbol bonusSymbol) {
        this.matrix = matrix;
        this.reward = reward;
        this.appliedWinningCombinations = appliedWinningCombinations;
        this.appliedBonusSymbol = appliedBonusSymbol;
    }

    public void setMatrix(List<List<Symbol>> matrix) {
        this.matrix = matrix;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public void setAppliedWinningCombinations(AppliedWinningCombinations appliedWinningCombinations) {
        this.appliedWinningCombinations = appliedWinningCombinations;
    }

    public void setAppliedBonusSymbol(BonusSymbol appliedBonusSymbol) {
        this.appliedBonusSymbol = appliedBonusSymbol;
    }

    public List<List<Symbol>> getMatrix() {
        return matrix;
    }

    public double getReward() {
        return reward;
    }

    public AppliedWinningCombinations getAppliedWinningCombinations() {
        return appliedWinningCombinations;
    }

    public BonusSymbol getAppliedBonusSymbol() {
        return appliedBonusSymbol;
    }
}
