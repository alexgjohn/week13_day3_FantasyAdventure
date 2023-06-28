package Players;

import Enemies.Enemy;
import enums.Weapon;

public class Barbarian extends Fighter{
    public Barbarian(String name, Weapon weapon) {
        super(name, weapon);
    }

    public void useWeapon(Enemy enemy){
        super.useWeapon(enemy);
        super.useWeapon(enemy);
    }
}
