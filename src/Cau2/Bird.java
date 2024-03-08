package Cau2;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Hót chíp chíp");
    }

    @Override
    public void move() {
        System.out.println("Chim đang bay");
    }
}
