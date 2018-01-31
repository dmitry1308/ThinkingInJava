package ru.shepin.chapter5.apple;

public class Main {
    static class Person{
        public void eat(Apple apple) {
            Apple peeled = apple.getPeeled();
            System.out.println("Yummy");
        }
    }

    static class Peeler {
        static Apple peel(Apple apple) {
            return apple;
        }
    }

    static class Apple {
        Apple getPeeled() {
            return Peeler.peel(this);
        }
    }

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
