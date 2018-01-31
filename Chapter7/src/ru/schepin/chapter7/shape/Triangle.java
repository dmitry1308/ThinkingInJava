package ru.schepin.chapter7.shape;

public class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
    }

    @Override
    public void dispose() {
        System.out.println();
        super.dispose();
    }
}
