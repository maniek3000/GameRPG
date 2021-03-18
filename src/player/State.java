package player;

import GameStart.Game;

public class State {
    Game game;


    public void lessHp(int x) {
        if (game.player.getHp() > x) game.player.setHp(game.player.getHp() - x);
        else {
            System.out.println("Ojoj...Przegrałeś... Nawet nie wiesz jak mi bardzo... wszystko jedno...");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }

    public void moreHp(int x) {
if (game.player.getHp()+x<game.player.getMaxHp())game.player.setHp(game.player.getHp()+x);
else //todo zrobic morehp i poprawic lesshp dodajac sout
    }
}
