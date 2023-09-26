import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupContentsTest {

    @Test
    void getLiquidType() {
        CupContents c = new CupContents("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getPercentFull() {
        CupContents c = new CupContents("Orange Juice", 85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        CupContents c = new CupContents("Orange Juice", 85.5);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }
}