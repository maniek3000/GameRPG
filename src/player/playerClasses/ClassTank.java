package player.playerClasses;

import player.Player;

public class ClassTank extends Player {
    public ClassTank(String name) {
        super(name);
        setMinPower(10);
        setMaxPower(15);
        setMaxHp(200);
        setHp(getMaxHp());
        setDefence(10);
    }
}
