package ae.cyberspeed.model;

import ae.cyberspeed.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class GameBoardJsonOutputTest {

    @Test
    public void shouldGenerateGameBoardJsonOutput_thencorrect() throws JsonProcessingException {
        var output = "{\"matrix\":[],\"reward\":0,\"applied_winning_combinations\":{\"symbols\":null},\"applied_bonus_symbol\":null}";

        var objectMapper = new ObjectMapper();

        var standardSymbolOutput = objectMapper
                .writeValueAsString(new GameBoard(new ArrayList<>(),0,
                        new AppliedWinningCombinations(), new Symbols()._10x));

        assertEquals(output, standardSymbolOutput);
    }
}
