package enums;

public enum Weapon {
    SWORD(35),
    AXE(25),
    CLUB(15);

    private int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
