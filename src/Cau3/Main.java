package Cau3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborgini Aventador", "Đỏ");
        System.out.println("Thương hiệu: " + car.getBrand());
        System.out.println("Màu sắc: " + car.getColor());
        car.start();
        car.speed();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Z1000", "Xanh");
        System.out.println("Thương hiệu: " + motorcycle.getBrand());
        System.out.println("Màu sắc: " + motorcycle.getColor());
        motorcycle.start();
        motorcycle.speed();
        motorcycle.stop();

        Truck truck = new Truck("Hyundai", "Trắng");
        System.out.println("Thương hiệu: " + truck.getBrand());
        System.out.println("Màu sắc: " + truck.getColor());
        truck.start();
        truck.speed();
        truck.stop();
    }
}