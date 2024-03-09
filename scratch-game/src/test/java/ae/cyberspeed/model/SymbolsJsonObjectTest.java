package ae.cyberspeed.model;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import jakarta.json.*;
import net.joshka.junit.json.params.*;
import org.junit.jupiter.params.*;

import static org.junit.Assert.*;

public class SymbolsJsonObjectTest {

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/symbols.json"})
    public void shouldCheckSymbolsNotBlankInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertFalse(jsonObject.get("symbols").toString().isBlank());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/symbols.json"})
    public void shouldCheckNumberOfSymbolsInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertTrue(jsonObject.get("symbols").asJsonObject().size() == 11);
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/symbols.json"})
    public void shouldCheckFirstElementOfSymbolsInJsonFile_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        StandardSymbol beanStandard = new ObjectMapper()
                .readerFor(StandardSymbol.class)
                .readValue(jsonObject.get("symbols").asJsonObject().get("A").toString());
        assertEquals("standard", beanStandard.getType().getType());
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/symbols.json"})
    public void shouldCheckLastElementOfSymbolsInJsonFile_thenCorrect(JsonObject jsonObject) throws JsonProcessingException {
        BonusSymbol beanStandard = new ObjectMapper()
                .readerFor(BonusSymbol.class)
                .readValue(jsonObject.get("symbols").asJsonObject().get("MISS").toString());
        assertEquals("bonus", beanStandard.getType().getType());
    }
}
