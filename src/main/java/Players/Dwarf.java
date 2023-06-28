package Players;

import enums.Weapon;

public class Dwarf extends Fighter {

    private int hp;

    public Dwarf(String name, Weapon weapon) {
        super(name, weapon);
        this.hp = 120;
    }

    @Override
    public int getHp(){
        return hp;
    }




}
