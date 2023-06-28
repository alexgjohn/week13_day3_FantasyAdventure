
import Loot.Loot;
import Players.Cleric;
import enums.HealingMethod;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ClericTest {

    private Cleric cleric;
    private Cleric cleric2;
    private Loot loot;


    @Before
    public void before(){
        cleric = new Cleric("Joffrey", HealingMethod.HERB);
        cleric2 = new Cleric("Ned", HealingMethod.POTION);
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Joffrey", cleric.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void canAddToInventory(){
        cleric.addLoot(loot);
        assertEquals(1, cleric.getInventory().size());
    }

    @Test
    public void hasHealingMethod(){
        assertEquals(HealingMethod.HERB, cleric.getHealingMethod());
    }

    @Test
    public void canChangeHealingMethod(){
        cleric.setHealingMethod(HealingMethod.POTION);
        assertEquals(HealingMethod.POTION, cleric.getHealingMethod());
    }

    @Test
    public void canHealOtherPlayer(){
        cleric.setHp(10);
        cleric2.heal(cleric);
        assertEquals(45, cleric.getHp());
    }

}
