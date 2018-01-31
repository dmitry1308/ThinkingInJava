package ru.schepin.chapter5.serialization;

import java.io.Serializable;

public class Data implements Serializable {
    private int i;
    public Data (int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}
