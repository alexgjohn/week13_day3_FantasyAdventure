package Players;

import Enemies.Enemy;
import behaviours.IDamageable;
import enums.Creature;
import enums.Spell;

public class Wizard extends SpellCaster{

    public Wizard(String name, Spell spell, Creature creature) {
        super(name, spell, creature);
    }

    public void castSpell(IDamageable enemy){
        super.castSpell(enemy);
        super.castSpell(enemy);
    }

}
