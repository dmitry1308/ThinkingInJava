package ru.shepin.chapter5.flowers;

public class Main {
    public static class Flowers {
        int petalCount = 0;
        String s = "Init value";


        public Flowers(int petals) {
            petalCount = petals;
            System.out.println("����������� � ���������� int " + petalCount);
        }

        public Flowers(String ss) {
            s = ss;
            System.out.println("����������� � ���������� String " + s);
        }


        public Flowers(int petalCount, String ss) {
            this(petalCount);
            s = ss;
            System.out.println("��������� string  � int");
        }

        public Flowers() {
            this(47, "hi");
        }



    }


    public static void main(String[] args) {
        Flowers flowers = new Flowers();



    }
}
