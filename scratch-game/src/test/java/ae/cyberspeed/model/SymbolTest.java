package ae.cyberspeed.model;

import com.fasterxml.jackson.databind.*;
import org.junit.*;

import java.io.*;

import static org.junit.Assert.*;

public class SymbolTest {

    @Test
    public void whenDeserializingSymbolsByType_thenCorrect()
            throws IOException {

        String symbolStandard = "{\"reward_multiplier\":50,\"type\":\"standard\"}";

        StandardSymbol beanStandard = new ObjectMapper()
                .readerFor(StandardSymbol.class)
                .readValue(symbolStandard);
        assertEquals("standard", beanStandard.getType().getType());

        String symbolBonus = "{\"extra\":500,\"type\":\"bonus\", \"impact\":\"miss\"}";

        BonusSymbol beanBonus = new ObjectMapper()
                .readerFor(BonusSymbol.class)
                .readValue(symbolBonus);
        assertEquals("bonus", beanBonus.getType().getType());

        symbolBonus = "{\"type\":\"bonus\", \"impact\":\"miss\"}";

        BonusSymbol beanBonusTypeImpact = new ObjectMapper()
                .readerFor(BonusSymbol.class)
                .readValue(symbolBonus);
        assertEquals("miss", beanBonusTypeImpact.getImpact());

        symbolBonus = "{\"reward_multiplier\":50,\"type\":\"bonus\", \"impact\":\"miss\"}";

        BonusSymbol beanBonusRewardTypeImpact = new ObjectMapper()
                .readerFor(BonusSymbol.class)
                .readValue(symbolBonus);
        assertEquals(50, beanBonusRewardTypeImpact.getRewardMultiplier(), 0);
    }

    @Test
    public void whenDeserializingSymbolsWithDynamicName_thenCorrect()
            throws IOException {
        String symbolStandard = "{\"A\":{\"reward_multiplier\":50,\"type\":\"standard\"}}";

        Symbols beanStandard = new ObjectMapper()
                .readValue(symbolStandard, Symbols.class);
        assertEquals("standard", beanStandard.getA().getType().getType());
    }
}
