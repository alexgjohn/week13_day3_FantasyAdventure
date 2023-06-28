package behaviours;

import Enemies.Enemy;
import enums.Weapon;

public interface IWeaponWield {

    public void useWeapon(Enemy enemy);
    public Weapon getWeapon();
    public void setWeapon(Weapon weapon);
}
