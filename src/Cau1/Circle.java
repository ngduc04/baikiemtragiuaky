package Cau1;

public class Circle extends Shape {
    private float radius;

    public Circle(String color, float borderWidth, float radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }
}


