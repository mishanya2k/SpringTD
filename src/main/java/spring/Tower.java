package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.interfaces.IArcher;
import spring.interfaces.ITower;



public class Tower implements ITower {

    private int level;
    private Archer archer;


    public Tower(int level, Archer archer) {
        this.level = level;
        this.archer = archer;
    }


    public void dps() {
        System.out.println("level of tower/archer " + getLevel() + " " + archer.getLevel() + "\n" +
        "damage of tower/archer " + getDamage() + " " + archer.getDamage());
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        if(level == 1)
        return 25;
        else if (level == 2)
            return 50;
        else
            return 100;

    }

    public IArcher getArcher(){
        return archer;
    }
}
