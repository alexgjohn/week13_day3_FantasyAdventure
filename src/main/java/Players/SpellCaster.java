package Players;

import Enemies.Enemy;
import behaviours.ISpellCast;
import enums.Creature;
import enums.Spell;

public abstract class SpellCaster extends Player implements ISpellCast {

    private Spell spell;
    private Creature creature;

    public SpellCaster(String name, Spell spell, Creature creature) {
        super(name);
        this.spell = spell;
        this.creature = creature;
    }


    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void castSpell(Enemy enemy){
        enemy.takeDamage(spell.getDamage());
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public void takeDamage(int damage){
        int damageTaken = (damage - this.getCreature().getDamageReduction());
        setHp(getHp() - damageTaken);
    }
}
