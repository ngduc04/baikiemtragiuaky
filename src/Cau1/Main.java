package Cau1;

    public class Main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle("Đỏ", 2.0f, 5.0f, 3.0f);
            System.out.println("Diện tích hình chữ nhật: " + rectangle.area());
            System.out.println("Chu vi hình chữ nhật: " + rectangle.perimeter());


            Circle circle = new Circle("Xanh dương", 1.0f, 4.0f);
            System.out.println("Diện tích hình tròn: " + circle.area());
            System.out.println("Chu vi hình tròn: " + circle.perimeter());


            Triangle triangle = new Triangle("Xanh lá", 0.5f, 3.0f, 4.0f, 5.0f);
            System.out.println("Diện tích hình tam giác: " + triangle.area());
            System.out.println("Chu vi hình tam giác: " + triangle.perimeter());
        }
    }
