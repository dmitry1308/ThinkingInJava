package ru.shepin.chapter3.throwCoin;

public class Main {
    public static void main(String[] args) {
        int eagle = 1;

        int randomNumber = (int) (Math.random() * 2);

        if (randomNumber == eagle) {
            System.out.println("eagle");
        } else {
            System.out.println("tails");
        }
    }
}
