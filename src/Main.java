import enemies.regularEnemies.Wolf;
import fight.Fight;
import gameStart.Game;
import player.Player;

public class Main {
    public static void main(String[] args) {
        Game.startGame();
        Wolf wolf= new Wolf();
        Fight.fight(wolf);

        //TODO system nagrów
        //TODO plansza
        //TODO menu główne
        //TODO system poruszania się
        //TODO czary

    }
}
