package Cau5;

public class Moderator extends User {

    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập với quyền kiểm duyệt");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký tài khoản kiểm duyệt");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất khỏi tài khoản kiểm duyệt");
    }
}