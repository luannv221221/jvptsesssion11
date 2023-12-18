package ra.demogeneric;

import java.util.List;

public class BookService implements IGeneric<Book,String>{
    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
