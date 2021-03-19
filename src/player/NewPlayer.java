package player;

import player.playerClasses.ClassMag;
import player.playerClasses.ClassTank;
import player.playerClasses.ClassWarrior;
import player.playerClasses.Classes;

import java.util.Scanner;

public class NewPlayer {
    private static String name;
    private static Scanner scanner;
    private static Classes classes;


    public static Player createPlayer() {
        classes = choiseClass();
        System.out.print("Podaj swoje imię bohaterze: ");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        if (classes == Classes.WARRIOR)
            return new ClassWarrior(name);
        else if (classes == Classes.MAG)
            return new ClassMag(name);
        else
            return new ClassTank(name);
    }

    private static Classes choiseClass() {
        System.out.println("Wybierz klasę: ");
        System.out.println("1- WOJOWNIK- Wojownicy szczycą się wielką siłą");
        System.out.println("2- MAG- Magowie władają tajemną siłą");
        System.out.println("3- TANK- Tanki są wytrzymałe na ciosy i mają więcej życia");
        while (true) {
            scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    return Classes.WARRIOR;
                case 2:
                    return Classes.MAG;
                case 3:
                    return Classes.TANK;
                default:
                    System.out.println("Dokonano niewłaściwego wyboru. Spróbuj jeszcz raz.");
            }
        }
    }
}
