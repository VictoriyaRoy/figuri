package ua.com.samsungitschool.figuri;

import java.util.Objects;

public final class Square extends Figure {
    private final int x;
    private Triangle triangle;
    private Square square;

    public Square(int x) {
        this.x = x;
    }

    public Square(RavnoStotoniyTriangle triangle) {
        this.x = triangle.getX();
    }

    public RavnoStotoniyTriangle getTriangle() {
        RavnoStotoniyTriangle triangle = new RavnoStotoniyTriangle(x);
        return triangle;
    }

    @Override
    public double getPerimeter() {
        return 4 * x;
    }

    @Override
    public double getArea() {
        return x * x;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square1 = (Square) o;
        return x == square1.x &&
                Objects.equals(triangle, square1.triangle) &&
                Objects.equals(square, square1.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, triangle, square);
    }
}
