package Cau1;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(String color, float borderWidth, float a, float b, float c) {
        super(color, borderWidth);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float area() {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public float perimeter() {
        return a + b + c;
    }
}
