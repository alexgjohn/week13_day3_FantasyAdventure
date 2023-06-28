package Enemies;

import behaviours.IDamageable;
import enums.Species;

public class Enemy implements IDamageable {

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
        if(species.getHp() <= 0){
            die();
        }
    }

    @Override
    public void die() {
        this.alive = false;
    }
}
