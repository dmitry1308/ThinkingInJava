package ru.schepin.chapter7.shape;

public class CadSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CadSystem(int i) {
        super(i + 1);
        for (int j = 0; j <lines.length ; j++) {
            new Line(j, j * j);
            Circle circle = new Circle(1);
            Triangle triangle = new Triangle(1);
            System.out.println("Комбинированный конструктор");
        }
    }

    @Override
    public void dispose() {
        System.out.println("CadSystem.dispose");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
            super.dispose();
        }
    }
}
