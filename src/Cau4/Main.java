package Cau4;

public class Main {
    public static void main(String[] args) {
        Book book1 = new FictionBook("Harry Potter", "Duc", "Duc");
        System.out.println(book1.getInformation());



        Book book2 = new NonFictionBook("Quà tặng cuộc sống", "Linh", "Linh");
        System.out.println(book2.getInformation());



        Book book3 = new ScienceBook("Sách khoa học", "Trinh", "Trinh");
        System.out.println(book3.getInformation());
    }
}
