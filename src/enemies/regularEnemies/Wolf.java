package enemies.regularEnemies;

import com.sun.tools.javac.Main;
import enemies.Enemy;
import gameStart.Game;

public class Wolf extends Enemy {

    private int hp;
    private int power;
    private int defence;

    public Wolf(Game game){
        setName("Wilk");
        System.out.println(game);
        hp=10+ (int)(game.player.getMaxHp()/10*(Math.random()+0.5));
        power=5+ (int)((game.player.getMinPower()+ game.player.getMaxPower())/20*(Math.random()+0.5));
        defence= 2+(int)(game.player.getDefence()/5*(Math.random()+0.5));
        setMaxHp(hp);
        setHp(hp);
        setPower(power);
        setDefence(defence);
    }

}
