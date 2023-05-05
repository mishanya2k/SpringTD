package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.interfaces.IPlayground;
import spring.interfaces.ITower;

import java.util.List;
import java.util.Random;

@Component
public class Playground implements IPlayground {
    private List<ITower> listOfTowers;
    private int power;

    @Autowired
    public Playground(List<ITower> listOfTowers) {
        this.listOfTowers = listOfTowers;
    }

    public void power() {
        for(ITower tower:listOfTowers){
            tower.dps();
        }
    }

    @Override
    public int powerDps() {
        for(ITower tower:listOfTowers){
            power += tower.getDamage() + tower.getArcher().getDamage();
        }
        return power;
    }

    @Override
    public String play() {
        Random random = new Random();
        int number = random.nextInt(400);
        System.out.println(number);
        if(number >= powerDps())
            return "U loose";
            else
                return "u won";
    }
}
