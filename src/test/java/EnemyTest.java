import Enemies.Enemy;
import enums.Species;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy(Species.GOBLIN);
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

}
