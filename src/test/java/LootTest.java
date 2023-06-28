import Loot.Loot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LootTest {

    private Loot loot;

    @Before
    public void before(){
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Diamond", loot.getName());
    }

    @Test
    public void hasMonetaryValue(){
        assertEquals(1000.00, loot.getMonetaryValue(), 0.0);
    }
}
