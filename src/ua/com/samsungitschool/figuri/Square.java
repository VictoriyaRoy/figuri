package ua.com.samsungitschool.figuri;

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
}
