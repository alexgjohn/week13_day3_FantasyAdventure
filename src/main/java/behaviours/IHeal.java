package behaviours;

import enums.HealingMethod;

public interface IHeal {
    public void heal();
    public HealingMethod getHealingMethod();
    public void setHealingMethod();
}
