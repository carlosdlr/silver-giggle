package ae.cyberspeed;

import ae.cyberspeed.model.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.util.*;

import static ae.cyberspeed.logic.FunctionsUtil.*;
import static java.lang.System.*;
import static java.lang.System.Logger.*;

public class ScratchGame {

    private static Logger LOGGER = getLogger("ScratchGame");

    public static void main(String[] args) {
        // first step read configuration and bet value
        var betAmount = 100D;
        final var mapper = new ObjectMapper();

        LOGGER.log(Level.INFO,"-----------------Loading configuration---------------");
        final var configurationFunc = getConfiguration().apply("src/main/resources/configuration.json");
        final var configuration = configurationFunc.orElseThrow();
        LOGGER.log(Level.INFO, "-----------------Loaded configuration---------------");


        // let's shuffle the symbols matrix
        var symbolsList = getSymbolsAsList(configuration.getSymbols());
        var shuffledMatrix = getShuffledSymbols(configuration.getRows(),
                configuration.getColumns()).apply(symbolsList);
        LOGGER.log(Level.INFO, "-----------------Shuffling symbols---------------");
    }

    private static List<Symbol> getSymbolsAsList(Symbols symbols) {
        var symbolsList = new ArrayList<Symbol>();
        symbolsList.add(symbols.a);
        symbolsList.add(symbols.b);
        symbolsList.add(symbols.c);
        symbolsList.add(symbols.d);
        symbolsList.add(symbols.e);
        symbolsList.add(symbols.f);
        symbolsList.add(symbols._5x);
        symbolsList.add(symbols._10x);
        symbolsList.add(symbols.plus1000);
        symbolsList.add(symbols.plus500);
        symbolsList.add(symbols.miss);
        return symbolsList;
    }

}
