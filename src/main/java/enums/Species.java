package enums;

public enum Species {
    GOBLIN(50, 25),
    HARPY(70, 30),
    GHOST(100, 50);

    private int hp;

    private int damage;

    Species(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }
}
