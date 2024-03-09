package ae.cyberspeed.model;

import jakarta.json.*;
import net.joshka.junit.json.params.*;
import org.junit.jupiter.params.*;

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
}
