package ru.schepin.chapter7.game;

public class Main {
    static class Game {

        public Game(int i) {
            System.out.println("Game");
        }
    }

    static class  BoardGame extends Game {

        public BoardGame(int i) {
            super(i);

            System.out.println("BoardGame");
        }
    }


    static class Chess extends BoardGame {
        public Chess() {
            super(11);
            System.out.println("Chess");
        }
    }




    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
