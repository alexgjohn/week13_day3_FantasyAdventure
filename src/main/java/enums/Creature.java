package enums;

public enum Creature {
    OGRE (10),
    DRAGON(30),
    PHOENIX(20);

    private int damageReduction;

    Creature(int damageReduction){
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }
}
