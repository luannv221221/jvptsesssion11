package demo1.model;

public class Author {
    private int code;
    private String fullName;

    public Author() {
    }

    public Author(int code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
