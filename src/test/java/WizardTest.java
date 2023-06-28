import Enemies.Enemy;
import Loot.Loot;
import Players.Warlock;
import Players.Wizard;
import enums.Creature;
import enums.Species;
import enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Enemy goblin;
    private Loot loot;


    @Before
    public void before(){
        wizard = new Wizard("Gandalf", Spell.FIREBALL, Creature.PHOENIX);
        goblin = new Enemy(Species.GOBLIN);
        loot = new Loot("Diamond", 1000.00);
    }


    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, wizard.getHp());
    }

    @Test
    public void hasEmptyInventory(){
        assertEquals(0, wizard.getInventory().size());
    }


    @Test
    public void canAddLoot(){
        wizard.addLoot(loot);
        assertEquals(1, wizard.getInventory().size());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canChangeSpell(){
        wizard.setSpell(Spell.LIGHTNING_STRIKE);
        assertEquals(Spell.LIGHTNING_STRIKE, wizard.getSpell());
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(goblin);
        assertEquals(-20, goblin.getSpecies().getHp());
        assertEquals(false, goblin.isAlive());
    }


    @Test
    public void canTakeReducedDamage(){
        goblin.attack(wizard);
        assertEquals(95, wizard.getHp());
    }
}
