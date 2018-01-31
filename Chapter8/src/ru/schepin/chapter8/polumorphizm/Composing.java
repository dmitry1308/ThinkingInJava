package ru.schepin.chapter8.polumorphizm;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;


    public Composing(Shared shared) {
        System.out.println("�������" + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing" + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing" + id;
    }
}
