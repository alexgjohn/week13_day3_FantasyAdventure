import Enemies.Enemy;
import Loot.Loot;
import Players.Knight;
import enums.Species;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class KnightTest {

    private Knight knight;
    private Enemy goblin;
    private Loot loot;


    @Before
    public void before(){
        knight = new Knight("Sir Aric", Weapon.SWORD);
        goblin = new Enemy(Species.GOBLIN);
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Aric", knight.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, knight.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, knight.getInventory().size());
    }

    @Test
    public void hasArmourStrength() {
        assertEquals(20, knight.getArmourStrength());
    }

    @Test
    public void canAddLoot(){
        knight.addLoot(loot);
        assertEquals(1, knight.getInventory().size());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        knight.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, knight.getWeapon());
    }

    @Test
    public void canUseWeapon(){
        knight.useWeapon(goblin);
        assertEquals(15, goblin.getSpecies().getHp());
    }
}
