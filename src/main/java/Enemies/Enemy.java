package Enemies;

import Players.Barbarian;
import Players.Player;
import behaviours.IDamageable;
import behaviours.IEncounterable;
import enums.Species;

public class Enemy implements IDamageable, IEncounterable {

    private Species species;
    private boolean alive;

    public Enemy(Species species) {
        this.species = species;
        this.alive = true;
    }

    public Species getSpecies() {
        return species;
    }

    public void setHp(int hp){
        this.species.setHp(hp);
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public void takeDamage(int damage) {
        this.species.setHp(species.getHp() - damage);
        if(this.species.getHp() <= 0){
            die();
        }
    }

    @Override
    public void die() {
        this.alive = false;
    }

    public void attack(Player player) {
        player.takeDamage(this.species.getDamage());
    }

    @Override
    public void encounter(Player player) {

    }
}
