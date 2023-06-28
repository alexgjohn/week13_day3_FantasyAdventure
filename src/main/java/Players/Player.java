package Players;

import Loot.Loot;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int hp;

    private ArrayList<Loot> inventory;

    public Player(String name, int hp, ArrayList<Loot> inventory) {
        this.name = name;
        this.hp = hp;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }
}
