package ua.com.samsungitschool.figuri;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return x == that.x &&
                y == that.y &&
                h == that.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, h);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "x=" + x +
                ", y=" + y +
                ", h=" + h +
                '}';
    }
}
