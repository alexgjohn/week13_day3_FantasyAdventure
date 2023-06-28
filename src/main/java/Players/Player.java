package Players;

import Loot.Loot;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int hp;

    private ArrayList<Loot> inventory;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.inventory = new ArrayList<>();
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

    public void addLoot(Loot loot) {
        this.inventory.add(loot);
    }
}
