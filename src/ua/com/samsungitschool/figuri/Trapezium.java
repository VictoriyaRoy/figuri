package ua.com.samsungitschool.figuri;

public class Trapezium extends Figure {
    private final int a, b, c, d, h;

    public Trapezium(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return ((a + c) / 2) * h;
    }
}
