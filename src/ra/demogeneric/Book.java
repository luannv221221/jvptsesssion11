package ra.demogeneric;

public class Book {
    private String code;
    private String bookName;

    public Book() {
    }

    public Book(String code, String bookName) {
        this.code = code;
        this.bookName = bookName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
