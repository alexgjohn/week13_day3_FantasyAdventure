package Enemies;

import Players.Player;
import behaviours.IDamageable;
import enums.Species;

public class Enemy implements IDamageable{

    private Species species;
    private boolean alive;

    public Enemy(Species species) {
        this.species = species;
        this.alive = true;
    }

    public int getHp(){
        return species.getHp();
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
        String death = String.format("The %s is dead!", getSpecies().name().toLowerCase());
        System.out.println(death);
    }

    public void attack(Player player) {

        player.takeDamage(this.species.getDamage());
        if (player.getHp() <= 0){
            player.die();
        }
    }


}
