package fight;

import fight.cases.Attack;
import fight.cases.Backpack;
import fight.cases.Run;
import gameStart.Game;

import java.util.Scanner;

public class MenuFight {
    Scanner scanner = new Scanner(System.in);
    Attack a = new Attack();
    Backpack b = new Backpack();
    Run r = new Run();

    public void menuFight() {
        System.out.println("22");
        while (true) {
            menuText();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    a.attack();
                    break;
                case 2:
                    b.backpack();
                    break;
                case 3:
                    r.run();
                    break;

            }
        }
    }

    private void menuText() {
        System.out.println("1- Atakuj");
        System.out.println("2- Zajrzyj do plecaka");
        System.out.println("3- Uciekaj");
    }
}
