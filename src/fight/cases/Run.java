package fight.cases;

import enemies.Enemy;
import fight.MenuFight;
import player.Player;

public class Run {

    public static void run(Enemy enemy) {
        if (chanceToRunAway(enemy)) {
            System.out.println("Tym razem udało Ci się uciec. " + enemy.getName() + " zostaje daleko w tyle.");
            MenuFight.setI(-1);
        } else {
            System.out.println("Zacząłeś uciekać, ale tym razem " + enemy.getName() + " Cię dopadł");
            enemy.attack();
        }
    }

    private static boolean chanceToRunAway(Enemy enemy) {
        int d1 = (Player.averagePower() - enemy.getDefence()) / 3;
//        System.out.println("moja sila jego obrona "+ d1);
        int d2 = enemy.getPower() - Player.getDefence();
//        System.out.println("jego sila moja obrona "+ d2);
        int math = (int) (Math.random() * 3); //wypadnie 0, 1 albo 2
//        System.out.println("math"+math);
//        System.out.println("d1*math>d2"+d1*math+ " > "+d2);

        if (d1 * math > d2) {
//            System.out.println("d1*math>d2 prawda");
            int mrx2=(int)(Math.random() * 2 );
            if (mrx2==1) {
//                System.out.println("m.r*2 "+mrx2);
                return true;
            }
//            System.out.println("d1*math>d2 fałsz");
        }
        return false;
    }
}
//TODO sprawdź czy działa w innych walkach z innymi potworami