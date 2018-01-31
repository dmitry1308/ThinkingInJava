package ru.schepin.chapter7.shape;

public class Line extends Shape {
    private int start, end;
    public Line(int start,int end) {
        super(start);
        this.start = start;
        this.end = end;
    }

    @Override
    public void dispose() {
        System.out.println("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}
