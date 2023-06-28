package behaviours;

import Enemies.Enemy;
import enums.Spell;

public interface ISpellCast {
    public void castSpell(Enemy enemy);
    public Spell getSpell();
    public void setSpell(Spell spell);
}
