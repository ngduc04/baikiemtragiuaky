package Cau4;

public class ScienceBook extends NonFictionBook {

    public ScienceBook(String title, String author, String publisher) {
        super(title, author, publisher);
    }

    @Override
    public String getInformation() {
        return "Sách khoa học: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }

    @Override
    public void search(String keyword) {
        return ;
    }
}