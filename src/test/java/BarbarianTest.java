import Enemies.Enemy;
import Loot.Loot;
import Players.Barbarian;
import enums.Species;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BarbarianTest {
    private Barbarian barbarian;
    private Enemy goblin;
    private Loot loot;


    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        goblin = new Enemy(Species.GOBLIN);
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, barbarian.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, barbarian.getInventory().size());
    }

    @Test
    public void canAddLoot(){
        barbarian.addLoot(loot);
        assertEquals(1, barbarian.getInventory().size());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canUseWeapon(){
        barbarian.useWeapon(goblin);
        assertEquals(-20, goblin.getSpecies().getHp());
    }
}
