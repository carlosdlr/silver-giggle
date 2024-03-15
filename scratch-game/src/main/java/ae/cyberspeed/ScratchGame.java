package ae.cyberspeed;

import ae.cyberspeed.model.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.lang.reflect.*;
import java.util.*;

import static ae.cyberspeed.logic.FunctionsUtil.*;
import static java.lang.System.*;
import static java.lang.System.Logger.*;

public class ScratchGame {

    private static Logger LOGGER = getLogger("ScratchGame");

    public static void main(String[] args) throws JsonProcessingException, IllegalAccessException {
        // first step read configuration and bet value
        final var betAmount = 100D;

        LOGGER.log(Level.INFO,"-----------------Loading configuration---------------");
        final var configurationFunc = getConfiguration().apply("src/main/resources/configuration.json");
        final var configuration = configurationFunc.orElseThrow();
        LOGGER.log(Level.INFO, "-----------------Loaded configuration---------------");


        // let's shuffle the symbols matrix
        List<Symbol> symbolsList = getListOfType(configuration.getSymbols());
        final var shuffledMatrix = getShuffledSymbols(configuration.getRows(),
                configuration.getColumns()).apply(symbolsList);
        LOGGER.log(Level.INFO, "-----------------Shuffling symbols---------------");

        // let's calculate the reward
        final List<WinCombination> winCombinationList = getListOfType(configuration.getWinCombinations());
        LOGGER.log(Level.INFO, "-----------------Calculating reward---------------");
        final var gameBoardResult = calculateGameReward(betAmount)
                .apply(shuffledMatrix, winCombinationList);

        final var mapper = new ObjectMapper();
        LOGGER.log(Level.INFO, "------Reward Result---------------");
        LOGGER.log(Level.INFO, mapper.writeValueAsString(gameBoardResult));

    }

    private static <T> List<T> getListOfType(Object containerObject) throws IllegalAccessException {
        List<T> genericList = new ArrayList<>();
        Field[] fields = containerObject.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            T obj = (T) field.get(containerObject);
            genericList.add(obj);
        }
        return genericList;
    }



}
