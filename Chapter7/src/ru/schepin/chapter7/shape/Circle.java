package ru.schepin.chapter7.shape;

public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Рисуем окружность Circle");
    }

    @Override
    public void dispose() {
        System.out.println("Стираем окружность Circle");
        super.dispose();

    }
}
