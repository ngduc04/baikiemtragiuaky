package Cau4;

public class FictionBook extends Book {

    public FictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public String getInformation() {
        return "Sách hư cấu: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }

    @Override
    public void search(String keyword) {
        return ;
    }
}
