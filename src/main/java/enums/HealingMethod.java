package enums;

public enum HealingMethod {
    POTION(35),
    HERB(25),
    YOGA(15);

    private int HPRegained;

    HealingMethod(int HPRegained) {
        this.HPRegained = HPRegained;
    }

    public int getHPRegained() {
        return HPRegained;
    }
}
