package Cau1;

public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle(String color, float border, float length, float width) {
        super(color, border);
        this.length = length;
        this.width = width;
    }

    @Override
    public float area() {
        return length * width;
    }

    @Override
    public float perimeter() {
        return 2 * (length + width);
    }
}
