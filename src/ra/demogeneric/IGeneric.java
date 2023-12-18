package ra.demogeneric;

import java.util.List;

public interface IGeneric<T,E> {
    List<T> getAll();
    boolean delete(E e);

}
