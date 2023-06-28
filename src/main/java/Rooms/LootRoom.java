package Rooms;

import Loot.Loot;
import Players.Player;

public class LootRoom extends Room{

    private Loot loot;
    public LootRoom(Loot loot) {
        super();
        this.loot = loot;
    }

    public Loot getLoot() {
        return loot;
    }

    public String runEncounter(Player player){
        addPlayer(player);
        player.addLoot(loot);
        this.setComplete();
        return String.format("%s found %s.", player.getName(), loot.getName());
    }
}
