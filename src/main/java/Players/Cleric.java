package Players;

import Enemies.Enemy;
import behaviours.IHeal;
import enums.HealingMethod;

public class Cleric extends Player implements IHeal {


    private HealingMethod healingMethod;

    public Cleric(String name, HealingMethod healingMethod){
        super(name);
        this.healingMethod = healingMethod;
    }

    @Override
    public void heal(Player player) {
        int newHp = player.getHp() + this.healingMethod.getHPRegained();
        player.setHp(newHp);
    }

    public HealingMethod getHealingMethod() {
        return healingMethod;
    }

    @Override
    public void setHealingMethod(HealingMethod healingMethod) {
        this.healingMethod = healingMethod;
    }

    public void takeAction(Enemy enemy){

    }
}
