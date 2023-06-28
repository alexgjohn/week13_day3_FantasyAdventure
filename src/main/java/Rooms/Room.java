package Rooms;

import Players.Player;

import java.util.ArrayList;

public abstract class Room {



    private ArrayList<Player> players;

    private boolean isComplete;

    public Room() {
        players = new ArrayList<>();
        this.isComplete = false;
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setComplete() {
        isComplete = true;
    }
}
