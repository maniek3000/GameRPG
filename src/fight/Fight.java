package fight;

import enemies.Enemy;

public class Fight {

    public static void fight(Enemy enemy){
        System.out.println("Zaatakował Cię "+enemy.getName()+" - życie "+enemy.getHp()+", siła "+ enemy.getPower()+".");
        MenuFight.menuFight(enemy);

    }
}
