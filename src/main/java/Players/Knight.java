package Players;

import enums.Weapon;

public class Knight extends Fighter{
    private int armourStrength;

    public Knight(String name, Weapon weapon) {
        super(name, weapon);
        this.armourStrength = 20;
    }

    public int getArmourStrength() {
        return armourStrength;
    }

    public void takeDamage(int damage) {
        int damageTaken = (damage - this.armourStrength);
        setHp(getHp() - damageTaken);
    }
}
