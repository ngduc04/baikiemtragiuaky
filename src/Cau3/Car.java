package Cau3;

public class Car extends Vehicle {

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Khởi động");
    }

    @Override
    public void speed() {
        System.out.println("Tăng tốc");
    }

    @Override
    public void stop() {
        System.out.println("Dừng lại");
    }
}
