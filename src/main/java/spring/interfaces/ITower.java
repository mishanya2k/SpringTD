package spring.interfaces;

public interface ITower {
    //shows dmg and level of tower and archer
    void dps();

    //show lvl
    int getLevel();
    int getDamage();
    IArcher getArcher();
}
