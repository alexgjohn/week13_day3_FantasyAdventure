import Enemies.Enemy;
import Loot.Loot;
import Players.Barbarian;
import Players.Cleric;
import Players.Knight;
import Players.Warlock;
import Rooms.Room;
import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Enemy enemy;
    private Barbarian barbarian;
    private Loot loot;
    private Warlock warlock;
    private Cleric cleric;
    private Room lootRoom;
    private Room enemyRoom;

    @Before
    public void before() {
        enemy = new Enemy(Species.GOBLIN);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        loot = new Loot("Diamond", 1000.00);
        warlock = new Warlock("Ash", Spell.FIREBALL, Creature.PHOENIX);
        cleric = new Cleric("Joffrey", HealingMethod.HERB);
        lootRoom = new Room(loot);
        enemyRoom = new Room(enemy);
    }

    @Test
    public void hasContents(){
        assertEquals(loot, lootRoom.getContents());
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
}
