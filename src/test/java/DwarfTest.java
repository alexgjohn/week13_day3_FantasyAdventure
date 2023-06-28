import Enemies.Enemy;
import Loot.Loot;
import Players.Dwarf;
import enums.Species;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Enemy goblin;
    private Loot loot;


    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", Weapon.AXE);
        goblin = new Enemy(Species.GOBLIN);
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(120, dwarf.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, dwarf.getInventory().size());
    }

    @Test
    public void canAddLoot(){
        dwarf.addLoot(loot);
        assertEquals(1, dwarf.getInventory().size());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, dwarf.getWeapon());
    }

    @Test
    public void canUseWeapon(){
        dwarf.useWeapon(goblin);
        assertEquals(25, goblin.getSpecies().getHp());
    }
}
