package fight;

import enemies.Enemy;
import fight.cases.Attack;
import fight.cases.Backpack;
import fight.cases.Run;
import gameStart.Game;

import java.util.Scanner;

public class MenuFight {
    private static Scanner scanner = new Scanner(System.in);
    private static int i = 1;

    public static void menuFight(Enemy enemy) {

        while (i != -1) {
            menuText();
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    Attack.attack(enemy);
                    break;
                case 2:
                    Backpack.backpack();
                    break;
                case 3:
                    Run.run(enemy);
                    break;
            }
        }
    }

    private static void menuText() {
        System.out.println("1- Atakuj");
        System.out.println("2- Zajrzyj do plecaka");
        System.out.println("3- Uciekaj");
    }


    public static void setI(int x) {
        MenuFight.i = x;
    }
}
