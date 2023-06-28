package enums;

public enum Spell {
    FIREBALL(35),
    LIGHTNING_STRIKE(25),
    RAY_OF_FROST(15);

    private int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
