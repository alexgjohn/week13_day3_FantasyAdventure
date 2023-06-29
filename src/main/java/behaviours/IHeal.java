package behaviours;

import Players.Player;
import enums.HealingMethod;

public interface IHeal {
    public void heal(IDamageable player);
    public HealingMethod getHealingMethod();
    public void setHealingMethod(HealingMethod healingMethod);
}
