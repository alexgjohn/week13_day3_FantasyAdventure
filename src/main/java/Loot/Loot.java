package Loot;

public class Loot {

    private String name;
    private double monetaryValue;

    public Loot(String name, double monetaryValue) {
        this.name = name;
        this.monetaryValue = monetaryValue;
    }

    public String getName() {
        return name;
    }

    public double getMonetaryValue() {
        return monetaryValue;
    }
}
