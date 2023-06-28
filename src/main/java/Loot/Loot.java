package Loot;

import Players.Player;
import behaviours.IEncounterable;

public class Loot implements IEncounterable {

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

    @Override
    public void encounter(Player player) {
        player.addLoot(this);
    }
}
