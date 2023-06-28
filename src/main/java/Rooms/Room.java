package Rooms;

import Loot.Loot;
import Players.Barbarian;
import Players.Player;
import behaviours.IEncounterable;

import java.util.ArrayList;
import java.util.Collection;

public class Room {

    private IEncounterable contents;

    private ArrayList<Player> players;

    public Room(IEncounterable contents) {
        this.contents = contents;
        players = new ArrayList<>();
    }

    public IEncounterable getContents() {
        return contents;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
