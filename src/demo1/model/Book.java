package demo1.model;

public class Book {
    private String code;
    private String bookName;
    private double price;

    public Book() {
    }

    public Book(String code, String bookName, double price) {
        this.code = code;
        this.bookName = bookName;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
