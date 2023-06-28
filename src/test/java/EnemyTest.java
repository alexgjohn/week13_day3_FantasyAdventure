import Enemies.Enemy;
import Players.Barbarian;
import enums.Species;
import enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;
    private Barbarian barbarian;

    @Before
    public void before(){
        enemy = new Enemy(Species.GOBLIN);
        barbarian = new Barbarian("Conan", Weapon.SWORD);
    }

    @Test
    public void hasSpecies(){
        assertEquals(Species.GOBLIN, enemy.getSpecies());
    }

    @Test
    public void hasHp(){
        assertEquals(50, enemy.getSpecies().getHp());
    }

    @Test
    public void hasDamage(){
        assertEquals(25, enemy.getSpecies().getDamage());
    }

    @Test
    public void canDealDamage(){
        enemy.attack(barbarian);
        assertEquals(75, barbarian.getHp());
    }

    @Test
    public void canDie(){
        enemy.takeDamage(100);
        assertEquals(false, enemy.isAlive());

    }

}
