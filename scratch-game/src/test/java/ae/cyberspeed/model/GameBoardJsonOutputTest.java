package ae.cyberspeed.model;

import ae.cyberspeed.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import org.junit.*;

import java.util.*;

public class GameBoardJsonOutputTest {

    @Test
    public void shouldGenerateGameBoardJsonOutput_thencorrect() throws JsonProcessingException {
        var output = "{\n" +
                "    \"matrix\": [\n" +
                "        [\"A\", \"A\", \"B\"],\n" +
                "        [\"A\", \"+1000\", \"B\"],\n" +
                "        [\"A\", \"A\", \"B\"]\n" +
                "    ],\n" +
                "    \"reward\": 6600,\n" +
                "    \"applied_winning_combinations\": {\n" +
                "        \"A\": [\"same_symbol_5_times\", \"same_symbols_vertically\"],\n" +
                "        \"B\": [\"same_symbol_3_times\", \"same_symbols_vertically\"]\n" +
                "    },\n" +
                "    \"applied_bonus_symbol\": \"+1000\"\n" +
                "}";

        var objectMapper = new ObjectMapper();

        var standardSymbolOutput = objectMapper
                .writeValueAsString(new GameBoard(new ArrayList<>(),0,
                        new AppliedWinningCombinations(), new Symbols()._10x));

        System.out.println(standardSymbolOutput);

    }
}
