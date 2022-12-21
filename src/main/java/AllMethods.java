import java.util.Comparator;

/**
 * Интерфейс со всеми реализованными методами в классе MyArrayList
 */
public interface AllMethods<E> extends Iterable<E> {
    public boolean add(E e);
    public boolean addForIndex (E e, int index);

    public void delete(int index);

    public E get(int index);

    public void clear();

    public int size ();

}


