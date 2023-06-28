import Enemies.Enemy;
import Loot.Loot;
import Players.Barbarian;
import Players.Cleric;
import Players.Warlock;
import Rooms.LootRoom;
import Rooms.Room;
import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LootRoomTest {

    private Enemy enemy;
    private Barbarian barbarian;
    private Loot loot;
    private Warlock warlock;
    private Cleric cleric;
    private LootRoom lootRoom;


    @Before
    public void before() {
        enemy = new Enemy(Species.GOBLIN);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        loot = new Loot("Diamond", 1000.00);
        warlock = new Warlock("Ash", Spell.FIREBALL, Creature.PHOENIX);
        cleric = new Cleric("Joffrey", HealingMethod.HERB);
        lootRoom = new LootRoom(loot);
    }

    @Test
    public void hasLoot(){
        assertEquals(loot, lootRoom.getLoot());
    }

    @Test
    public void hasEmptyListOfPlayers(){
        assertEquals(0, lootRoom.getPlayers().size());
    }

    @Test
    public void canAddPlayers(){
        lootRoom.addPlayer(barbarian);
        lootRoom.addPlayer(warlock);
        assertEquals(2, lootRoom.getPlayers().size());
    }

    @Test
    public void canRunEncounter() {
        String result = lootRoom.runEncounter(barbarian);
        assertEquals("Conan found Diamond.", result);
    }
}
