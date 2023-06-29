package Players;

import Enemies.Enemy;
import behaviours.IDamageable;
import behaviours.IWeaponWield;
import enums.Weapon;

public abstract class Fighter extends Player implements IWeaponWield {

    private Weapon weapon;

    public Fighter(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }


    public void useWeapon(IDamageable enemy) {
        enemy.takeDamage(weapon.getDamage());
    }

    public Weapon getWeapon() {
        return this.weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeAction(IDamageable creature){

        String attack = String.format("%s attacked the enemy with their %s!", this.getName(), getWeapon().name().toLowerCase());
        System.out.println(attack);
        useWeapon(creature);
    }
}
