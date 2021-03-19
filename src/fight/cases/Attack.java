package fight.cases;

import enemies.Enemy;
import fight.MenuFight;
import player.Player;

public class Attack {
    private static int less;

    public static void attack(Enemy enemy) {
        less = Player.averagePower() - enemy.getDefence();
        isCriticDamage();
        if (less > 0)
            enemy.lessHp(less);
        else {
            System.out.println("Spudłowałeś...");
        }
        if (enemy.getHp() > 0) {
            enemy.attack();
        }
        else {
            MenuFight.setI(-1);
        }
    }

    private static void isCriticDamage() {
        if (less > 0 && Math.random() * Player.getCriticChance() > 0.9) {
            less += less * 0.5;
            System.out.print("Zadano obrażenia krytyczne!! ");
        }
    }
}