package Cau5;

public class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập với quyền quản trị viên");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký tài khoản quản trị viên");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất khỏi tài khoản quản trị viên");
    }
}

