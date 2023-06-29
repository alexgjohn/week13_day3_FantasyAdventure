package Players;

import Enemies.Enemy;
import behaviours.IDamageable;
import enums.Weapon;

public class Barbarian extends Fighter{
    public Barbarian(String name, Weapon weapon) {
        super(name, weapon);
    }

    public void useWeapon(IDamageable enemy){
        super.useWeapon(enemy);
        super.useWeapon(enemy);
    }

}
