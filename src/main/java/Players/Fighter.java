package Players;

import Enemies.Enemy;
import behaviours.IWeaponWield;
import enums.Weapon;

public abstract class Fighter extends Player implements IWeaponWield {

    private Weapon weapon;

    public Fighter(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }


    public void useWeapon(Enemy enemy) {
        enemy.setHp(enemy.getSpecies().getHp() - weapon.getDamage());
    }

    public Weapon getWeapon() {
        return this.weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
