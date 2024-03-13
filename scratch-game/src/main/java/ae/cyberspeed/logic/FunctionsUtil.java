package ae.cyberspeed.logic;

import ae.cyberspeed.*;
import ae.cyberspeed.model.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;
import java.util.*;
import java.util.function.*;

public class FunctionsUtil {

    public static Function<String, Optional<Configuration>> getConfiguration() {
        return fileName -> {
            ObjectMapper mapper = new ObjectMapper();
            Configuration obj;
            try {
                obj = mapper
                        .readerFor(Configuration.class)
                        .readValue(new File(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return Optional.of(obj);
        };
    }

    public static Function<List<Symbol>, List<List<Symbol>>> getShuffledSymbols(int rows, int cols) {
        return symbols -> {
            List<List<Symbol>> shuffledMatrix = new ArrayList<>(rows);
            symbols.forEach(row -> {
                Collections.shuffle(symbols);
                List<Symbol> symbolsRow = new ArrayList<>(symbols.subList(0, cols));
                Collections.shuffle(symbolsRow);
                if(shuffledMatrix.size()< rows)
                    shuffledMatrix.add(symbolsRow);
            });
          return shuffledMatrix;
        };
    }

    public static BiFunction<List<List<Symbol>>, List<WinCombination>, GameBoard> calculateGameReward(double betAmount) {
        BiFunction<String, Configuration, WinCombination>
                findWinCpombination = (combinationName, configuration) -> {



            return null;
        };

        //var checkIfThereIs3SameSymbols

        return (matrix, bettingValue) -> {

            return null;
        };
    }



}
