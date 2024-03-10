package ae.cyberspeed.model;

import jakarta.json.*;
import net.joshka.junit.json.params.*;
import org.junit.jupiter.params.*;

import static org.junit.Assert.*;

public class ConfigurationJsonObjectTest {

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @JsonFileSource(resources = {"/configuration.json"})
    public void shouldCheckNotBlankInJsonFile_thenCorrect(JsonObject jsonObject) {
        assertFalse(jsonObject.asJsonObject().toString().isBlank());
    }
}
