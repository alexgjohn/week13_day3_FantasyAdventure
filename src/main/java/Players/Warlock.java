package Players;

import enums.Creature;
import enums.Spell;

public class Warlock extends SpellCaster {

    public Warlock(String name, Spell spell, Creature creature) {
        super(name, spell, creature);
    }

    public void healSelf() {
        this.setHp(getHp() + 20);
    }
}
