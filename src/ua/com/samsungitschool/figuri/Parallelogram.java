package ua.com.samsungitschool.figuri;

public class Parallelogram extends Figure {
    private final int x, y, h;

    public Parallelogram(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getPerimeter() {
        return (x + y) * 2;
    }

    @Override
    public double getArea() {
        return x * h;
    }
}
