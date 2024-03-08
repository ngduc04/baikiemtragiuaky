package Cau2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Sủa gâu gâu");
    }

    @Override
    public void move() {
        System.out.println("Chó đang chạy");
    }
}
