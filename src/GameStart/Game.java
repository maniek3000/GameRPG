package GameStart;

import player.NewPlayer;
import player.Player;

public class Game {
    public Player player;
    private NewPlayer newPlayer=new NewPlayer();

    public Game(){
        player= newPlayer.createPlayer();


    }

}
