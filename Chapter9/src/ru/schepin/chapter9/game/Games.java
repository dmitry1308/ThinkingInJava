package ru.schepin.chapter9.game;

public class Games {
    public static void playGame(GameFactory factory) {
        Game g=factory.getGame();
        while (g.move()) {
            ;
        }
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());

    }
}