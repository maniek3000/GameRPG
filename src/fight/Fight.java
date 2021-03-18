package fight;

import enemies.Enemy;
import gameStart.Game;

public class Fight {
    MenuFight menuFight= new MenuFight();

    public void fight(Game game,Enemy enemy){
        System.out.println("Zaatakował Cię "+enemy.getName()+" - życie "+enemy.getHp()+", siła "+ enemy.getPower()+".");
        menuFight.menuFight();

    }
}
