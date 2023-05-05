package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.interfaces.IArcher;

@Component
@Scope("prototype")
public class Archer implements IArcher {
    private int level;

    public Archer(int level) {
        this.level = level;
    }

    public int getDamage() {
        if (level == 1)
            return 10;
        else if (level == 2)
            return 20;
        else
            return 40;
    }

    @Override
    public int getLevel() {
        return level;
    }
}
