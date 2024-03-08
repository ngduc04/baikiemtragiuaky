package Cau4;

public class NonFictionBook extends Book {

    public NonFictionBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public String getInformation() {
        return "Sách phi hư cấu: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }

    @Override
    public void search(String keyword) {
        return ;
    }
}