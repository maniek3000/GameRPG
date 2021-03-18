package player.playerClasses;

import player.Player;

public class ClassMag extends Player {


    public ClassMag(String name) {
        super(name);
        setMp(100);
        setMaxMp(getMp());
    }


}
