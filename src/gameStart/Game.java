package gameStart;

import fight.Fight;
import player.NewPlayer;
import player.Player;

public class Game {
    public Player player;
    private NewPlayer newPlayer=new NewPlayer();
    public Fight fight= new Fight();

    public Game(){
        player= newPlayer.createPlayer();


    }

}
