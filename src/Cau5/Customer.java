package Cau5;

public class Customer extends User {

    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập với quyền khách hàng");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký tài khoản khách hàng");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất khỏi tài khoản khách hàng");
    }
}