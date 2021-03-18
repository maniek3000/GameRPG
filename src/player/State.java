package player;

import gameStart.Game;

public class State {
    Game game;


    public void lessHp(int x) {
        if (game.player.getHp() > x) {
            game.player.setHp(game.player.getHp() - x);
            System.out.println("Twoje życie wynosi " + game.player.getHp() + "/" + game.player.getMaxHp() + " pkt.");
        } else {
            System.out.println("Ojoj...Przegrałeś... Nawet nie wiesz jak mi bardzo... wszystko jedno...");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }

    public void moreHp(int x) {
        if (game.player.getHp() + x < game.player.getMaxHp()) {
            game.player.setHp(game.player.getHp() + x);
            System.out.println("Twoje życie wynosi " + game.player.getHp() + "/" + game.player.getMaxHp() + " pkt.");
        } else {
            game.player.setHp(game.player.getMaxHp());
            System.out.println("Twoje życie wynosi " + game.player.getHp() + "/" + game.player.getMaxHp() + " pkt.");

        }
    }

    public void lessMp(int x) {
        if (game.player.getMp() > x) {
            game.player.setMp(game.player.getMp() - x);
            System.out.println(" Twoja mana wynosi " + game.player.getMp() + "/" + game.player.getMaxMp() + " pkt.");
        } else {
            System.out.println("Za mało many");
        }
    }

    public void moreMp(int x) {
        if (game.player.getMp() + x < game.player.getMaxMp()) {
            game.player.setMp(game.player.getMp() + x);
            System.out.println("Twoja mana wynosi " + game.player.getMp() + "/" + game.player.getMaxMp() + " pkt.");
        } else {
            game.player.setMp(game.player.getMaxMp());
            System.out.println("Twoja mana wynosi " + game.player.getMp() + "/" + game.player.getMaxMp() + " pkt.");

        }
    }
}
