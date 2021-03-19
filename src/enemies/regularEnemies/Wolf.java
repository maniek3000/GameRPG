package enemies.regularEnemies;

import com.sun.tools.javac.Main;
import enemies.Enemy;
import gameStart.Game;
import player.Player;

public class Wolf extends Enemy {

    private int hp;
    private int power;
    private int defence;

    public Wolf() {
        setName("Wilk");
        hp = 10 + (int) (Player.getMaxHp() / 10 * (Math.random() + 0.5));
        power = 7 + (int) ((Player.getMinPower() + Player.getMaxPower()) / 20 * (Math.random() + 0.5));
        defence = 2 + (int) (Player.getDefence() / 5 * (Math.random() + 0.5));
        setMaxHp(hp);
        setHp(hp);
        setPower(power);
        setDefence(defence);
    }

}
