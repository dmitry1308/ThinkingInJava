package ru.schepin.chapter9.processor;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);

    public static String s = "dima";

    public static void main(String[] args) {
        Apply.process(new UpCase(),s);
    }

}
