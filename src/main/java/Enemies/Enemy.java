package Enemies;

import enums.Species;

public class Enemy {

    private Species species;

    public Enemy(Species species) {
        this.species = species;
    }

    public Species getSpecies() {
        return species;
    }
}
