package ua.com.samsungitschool.figuri;

public class Pentagon extends Figure {
    private final int a, b, c, d, e;

    public Pentagon(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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

    public int getE() {
        return e;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
