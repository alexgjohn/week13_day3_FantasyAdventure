package Players;

import Enemies.Enemy;
import behaviours.IDamageable;
import behaviours.IHeal;
import enums.HealingMethod;

public class Cleric extends Player implements IHeal {


    private HealingMethod healingMethod;

    public Cleric(String name, HealingMethod healingMethod){
        super(name);
        this.healingMethod = healingMethod;
    }

    public void heal(IDamageable player) {
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

    public void unarmedStrike(IDamageable creature){
        creature.takeDamage(10);
    }


    public void takeAction(IDamageable creature){
        String result = creature.getClass().getName();
        if (result.contains("Players")){
            String outcome = String.format("%s healed their ally by %d points!", this.getName(), healingMethod.getHPRegained());
            System.out.println(outcome);
            heal(creature);
        } else{
            String outcome = String.format("%s punched the enemy!", this.getName());
            System.out.println(outcome);
            unarmedStrike(creature);
        }
    }
}
