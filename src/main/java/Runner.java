import Enemies.Enemy;
import Players.Barbarian;
import Players.Cleric;
import Players.Warlock;
import enums.*;

public class Runner {

    public static void main(String[] args) {
        Cleric cleric = new Cleric("Bob", HealingMethod.HERB);
        Warlock warlock = new Warlock("Dave", Spell.FIREBALL, Creature.DRAGON);
        Barbarian barbarian = new Barbarian("Conan", Weapon.SWORD);
        Enemy goblin = new Enemy(Species.GOBLIN);

        cleric.takeAction(warlock);
        cleric.takeAction(goblin);
        barbarian.takeAction(goblin);
    }
}
