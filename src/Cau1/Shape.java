package Cau1;

public abstract class Shape {
    protected String color;
    protected float borderWidth;

    public Shape(String color, float borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(float borderWidth) {
        this.borderWidth = borderWidth;
    }


    public abstract float area();

    public abstract float perimeter();
}
