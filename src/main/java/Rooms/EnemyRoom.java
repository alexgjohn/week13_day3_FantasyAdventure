package Rooms;

import Enemies.Enemy;
import Players.Barbarian;
import Players.Player;

public class EnemyRoom extends Room{

    private Enemy enemy;
    public EnemyRoom(Enemy enemy) {
        super();
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public String runEncounter(Player player) {
        String outcome = null;
        while(player.isAlive() && enemy.isAlive()){
            enemy.attack(player);
            player.takeAction(enemy);
        }
        if (player.isAlive() && !enemy.isAlive()){
            outcome = String.format("%s defeated the %s.", player.getName(), enemy.getSpecies().name().toLowerCase());
        } else if (enemy.isAlive() && !player.isAlive()) {
            outcome = String.format("The %s killed %s, oh my god!", enemy.getSpecies().name().toLowerCase(), player.getName());
        } else {
            outcome = String.format("%s and the %s both slew each other. In another life, they could have been friends.", player.getName(), enemy.getSpecies().name().toLowerCase());
        }
        return outcome;
    }
}
