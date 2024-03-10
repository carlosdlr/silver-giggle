package ae.cyberspeed.model;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import jakarta.json.*;
import net.joshka.junit.json.params.*;
import org.junit.jupiter.params.*;

import static org.junit.Assert.*;

public class CombinationsJsonObjectTest {

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/combinations.json"})
    public void shouldCheckNotBlankWinCombinationsInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertFalse(jsonObject.get("win_combinations").toString().isBlank());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/combinations.json"})
    public void shouldCheckNumberOfCombinationsInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertTrue(jsonObject.get("win_combinations").asJsonObject().size() == 11);
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/combinations.json"})
    public void shouldCheckFirstElementOfCombinationsInJsonFile_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        WinCombination beanStandard = new ObjectMapper()
                .readerFor(WinCombination.class)
                .readValue(jsonObject.get("win_combinations").asJsonObject().get("same_symbol_3_times").toString());
        assertEquals("same_symbols", beanStandard.getGroup());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/combinations.json"})
    public void shouldCheckElementOfCombinationsWithCoveredAreasInJsonFile_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        WinCombination beanStandard = new ObjectMapper()
                .readerFor(WinCombination.class)
                .readValue(jsonObject.get("win_combinations").asJsonObject().get("same_symbols_horizontally").toString());
        assertEquals(3, beanStandard.getCoveredAreas().size());
    }

}
