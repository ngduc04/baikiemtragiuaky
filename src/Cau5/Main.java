package Cau5;

public class Main {
    public static void main(String[] args) {
        User user1 = new Admin("admin", "nmduck2004@gmail.com", "1234");
        user1.login();

        User user2 = new Customer("customer", "linh123@gmail.com", "546456");
        user2.register();

        User user3 = new Moderator("moderator", "abcd@gmail.com", "sdasas");
        user3.logout();
    }
}