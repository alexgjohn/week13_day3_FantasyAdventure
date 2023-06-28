import Enemies.Enemy;
import Loot.Loot;
import Players.Barbarian;
import Players.Cleric;
import Players.Warlock;
import Rooms.EnemyRoom;
import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    private Enemy enemy;
    private Barbarian barbarian;
    private Loot loot;
    private Warlock warlock;
    private Cleric cleric;
    private EnemyRoom enemyRoom;


    @Before
    public void before() {
        enemy = new Enemy(Species.GOBLIN);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
        loot = new Loot("Diamond", 1000.00);
        warlock = new Warlock("Ash", Spell.FIREBALL, Creature.PHOENIX);
        cleric = new Cleric("Joffrey", HealingMethod.HERB);
        enemyRoom = new EnemyRoom(enemy);
    }

    @Test
    public void hasEnemy(){
        assertEquals(enemy, enemyRoom.getEnemy());
    }

    @Test
    public void hasEmptyListOfPlayers(){
        assertEquals(0, enemyRoom.getPlayers().size());
    }

    @Test
    public void canAddPlayers(){
        enemyRoom.addPlayer(barbarian);
        enemyRoom.addPlayer(warlock);
        assertEquals(2, enemyRoom.getPlayers().size());
    }

    @Test
    public void canRunEncounter(){
        String result = enemyRoom.runEncounter(barbarian);
        assertEquals("Conan defeated the goblin.", result);
    }
}
