package ua.com.samsungitschool.figuri;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezium trapezium = (Trapezium) o;
        return a == trapezium.a &&
                b == trapezium.b &&
                c == trapezium.c &&
                d == trapezium.d &&
                h == trapezium.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, h);
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", h=" + h +
                '}';
    }
}
