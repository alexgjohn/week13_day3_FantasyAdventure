package Players;

import Enemies.Enemy;
import enums.Creature;
import enums.Spell;

public class Wizard extends SpellCaster{

    public Wizard(String name, Spell spell, Creature creature) {
        super(name, spell, creature);
    }

    public void castSpell(Enemy enemy){
        super.castSpell(enemy);
        super.castSpell(enemy);
    }

}
