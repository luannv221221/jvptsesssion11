package ra.demogeneric;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        List<Student> list = studentService.getAll();

        BookService bookService = new BookService();
        List<Book> books = bookService.getAll();

    }
}
