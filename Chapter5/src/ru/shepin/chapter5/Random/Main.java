package ru.shepin.chapter5.Random;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random();
        a = new int[random.nextInt(40)];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }
}
