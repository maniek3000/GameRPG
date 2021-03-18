package player.playerClasses;

import player.Player;

public class ClassWarrior extends Player {
    public ClassWarrior(String name) {
        super(name);
        setMinPower(15);
        setMaxPower(20);
        setCriticChance(0.3);
    }

}

