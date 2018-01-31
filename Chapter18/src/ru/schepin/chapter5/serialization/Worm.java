package ru.schepin.chapter5.serialization;

import java.io.Serializable;
import java.util.Random;

public class Worm implements Serializable {
    private static Random rand = new Random(47);

    private Data[] d = {
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))};

    private Worm next;
    private char c;


    public Worm(int i,char c) {
        System.out.println("Worm constructor: " + i);
        this.c = c;
        if (--i > 0) {
            next = new Worm(i, (char) (c + 1));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(c);
        result.append("(");
        for (Data dat: d) {
            result.append(dat);
        }
        result.append(")");

        if (next != null) {
            result.append(next);
        }

        return result.toString();

    }
}
