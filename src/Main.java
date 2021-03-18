import enemies.regularEnemies.Wolf;
import fight.Fight;
import gameStart.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Wolf wolf= new Wolf(game);
        game.fight.fight(game,wolf);


    }
}
