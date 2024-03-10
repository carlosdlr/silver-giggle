package ae.cyberspeed.model;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import jakarta.json.*;
import net.joshka.junit.json.params.*;
import org.junit.jupiter.params.*;

import java.util.*;

import static org.junit.Assert.*;

public class ProbabilitiesJsonObjectTest {

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/probabilities.json"})
    public void shouldCheckProbabilitiesNotBlankInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertFalse(jsonObject.get("probabilities").toString().isBlank());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/probabilities.json"})
    public void shouldCheckNumberOfProbabilitiesConfInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertTrue(jsonObject.get("probabilities").asJsonObject().size() == 2);
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/probabilities.json"})
    public void shouldCheckFirstElementIsStandardSymbolList_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        ProbabilityStandardSymbol beanStandard = new ObjectMapper()
                .readerFor(ProbabilityStandardSymbol.class)
                .readValue(jsonObject.get("probabilities").asJsonObject()
                        .get("standard_symbols").asJsonArray().get(0).toString());
        assertEquals(1, beanStandard.getSymbols().a.getIntValue());
        assertEquals(0, beanStandard.getRow());
        assertEquals(0, beanStandard.getColumn());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/probabilities.json"})
    public void shouldCheckSecondElementIsBonusSymbol_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        ProbabilityBonusSymbol beanStandard = new ObjectMapper()
                .readerFor(ProbabilityBonusSymbol.class)
                .readValue(jsonObject.get("probabilities").asJsonObject()
                        .get("bonus_symbols").asJsonObject().toString());
        assertEquals(1, beanStandard.getSymbols()._10x.getIntValue());
    }
}
