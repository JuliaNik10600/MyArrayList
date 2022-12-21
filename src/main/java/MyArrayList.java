import java.util.Iterator;

public class MyArrayList<E> implements AllMethods<E> {
    private E[] elements;
    private final int default_capacity = 10;
    private int size = 0;
    private int capasity;

    /**
     * Конструкторы для создания
     */
    public MyArrayList(int capacity) {
        this.capasity = capacity;
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <=0! Try again.");
        } else {

            elements = (E[]) new Object[capacity];
        }
    }

    public MyArrayList() {
        elements = (E[]) new Object[default_capacity];
        capasity = default_capacity;
    }

    /**
     * Метод добавление элемента автоматически в конец.
     */
    @Override
    public boolean add(Object e) {
        try {
            //Вначале проверка на загруженность массива.
            if (size <= elements.length-1) {
                elements[size] = (E) e;
                size++;
                return true;
            } else {
                E[] temporary = elements;
                elements = (E[]) new Object[(temporary.length) * 3 / 2 + 1];
                System.arraycopy(temporary, 0, elements, 0, temporary.length);
                elements[size++] = (E) e;
                return true;
            }
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * Метод добавления элемента по индексу
     */
    @Override
    public boolean addForIndex(Object e, int index) {
        try {
            if (index < 0 ) {
                throw new IllegalArgumentException("Index is not correct! Try again.");
            } else {
                for (int i = size; i > index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = (E) e;
                size++;
                return true;
            }
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * Метод удаления по индексу
     */
    @Override
    public void delete(int index) {
        if (index < 0 | index > capasity) {
            throw new IllegalArgumentException("Index is not correct! Try again.");}
        else{
                for (int i = index; i < size; i++) {
                    elements[i] = elements[i + 1];
                }
            }
        }

        /**
         * Метод очистки
         */
        @Override
        public void clear () {
            elements = (E[]) new Object[capasity];
            size = 0;
        }

    /**
     * Метод, возращает количество эллементов
     */
    @Override
    public int size() {
        return elements.length;
    }

    /**
         * Метод получение элемента по индексу
         */
        @Override
        public E get ( int index){
            return elements[index];
        }

        /**
         * Итератор
         */
        @Override
        public Iterator iterator () {
            return new IteratorForMyArrays<>(elements);
        }

        /**
         * Метод для вывода на экран
         */
        public void read () {
            for (E el : elements) {
                System.out.print(el + " ");
            }
        }
    }
