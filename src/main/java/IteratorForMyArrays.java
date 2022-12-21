import java.util.Iterator;


/**
 * Класс IteratorForMyArrays для того что бы можно было проходится по элемента коллекции
 */
public class IteratorForMyArrays<E> implements Iterator<E> {
    private E[] objects;
    private int index = 0;

    public IteratorForMyArrays(E[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public E next() {
        return objects[index++];
    }
}

