package ru.schepin.chapter9.game;

public class CheckersFactory implements GameFactory {

    public Game getGame() {
        return new Checkers();
    }
}
