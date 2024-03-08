package Cau2;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meo meo");
    }

    @Override
    public void move() {
        System.out.println("Mèo đang chạy");
    }
}

