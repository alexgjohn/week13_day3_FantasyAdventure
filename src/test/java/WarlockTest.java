import Enemies.Enemy;
import Loot.Loot;
import Players.Warlock;
import enums.Creature;
import enums.Species;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private Enemy goblin;
    private Loot loot;


    @Before
    public void before(){
        warlock = new Warlock("Ash", Spell.FIREBALL, Creature.PHOENIX);
        goblin = new Enemy(Species.GOBLIN);
        loot = new Loot("Diamond", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ash", warlock.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, warlock.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, warlock.getInventory().size());
    }


    @Test
    public void canAddLoot(){
        warlock.addLoot(loot);
        assertEquals(1, warlock.getInventory().size());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FIREBALL, warlock.getSpell());
    }

    @Test
    public void canChangeSpell(){
        warlock.setSpell(Spell.LIGHTNING_STRIKE);
        assertEquals(Spell.LIGHTNING_STRIKE, warlock.getSpell());
    }

    @Test
    public void canCastSpell(){
        warlock.castSpell(goblin);
        assertEquals(15, goblin.getSpecies().getHp());
    }

    @Test
    public void canHealSelf(){
        warlock.healSelf();
        assertEquals(120, warlock.getHp());
    }

    @Test
    public void canTakeReducedDamage(){
        goblin.attack(warlock);
        assertEquals(95, warlock.getHp());
    }
}
