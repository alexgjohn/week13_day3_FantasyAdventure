package Rooms;

import Players.Player;

import java.util.ArrayList;
import java.util.Random;

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

    public boolean isComplete() {
        return isComplete;
    }

    public Player chooseRandomPlayer(){
        Random rand = new Random();
        int upperbound = (players.size() -1);
        int randomIndex = rand.nextInt(upperbound);
        return players.get(randomIndex);
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void removeDeadPlayers(){
        ArrayList<Player> remainingPlayers = new ArrayList<>();
        for (Player player:players){
            if (player.isAlive()){
                remainingPlayers.add(player);
            }
        }
        setPlayers(remainingPlayers);
    }
}
