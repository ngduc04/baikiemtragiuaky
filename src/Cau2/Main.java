package Cau2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", 2);
        System.out.println("Chó: " + dog.getName());
        System.out.println("Tuổi : " + dog.getAge());
        dog.say();
        dog.move();


        Cat cat = new Cat("Ai Cap", 2);
        System.out.println("Mèo: " + cat.getName());
        System.out.println("Tuổi : " + cat.getAge());
        cat.say();
        cat.move();


        Bird bird = new Bird("Tây", 2);
        System.out.println("Chim: " + bird.getName());
        System.out.println("Tuổi : " + bird.getAge());
        bird.say();
        bird.move();
    }
}