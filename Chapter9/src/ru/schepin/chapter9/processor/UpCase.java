package ru.schepin.chapter9.processor;

public class UpCase extends StringProcessor {

    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}
