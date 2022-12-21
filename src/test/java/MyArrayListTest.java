import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList<Integer> myArrayList = new MyArrayList<>();
    MyArrayList<Integer> myArrayList1 = new MyArrayList<>(8);
    MyArrayList<String> myArrayList2 = new MyArrayList<>();
    MyArrayList<String> myArrayList3 = new MyArrayList<>(5);

    @org.junit.jupiter.api.Test
    void add() {
        myArrayList.add(55);
        myArrayList.add(99);
        myArrayList.add(84);
        assertEquals(myArrayList.get(0), 55);
        assertEquals(myArrayList.get(1), 99);
        assertEquals(myArrayList.get(2), 84);

        myArrayList1.add(4);
        myArrayList1.add(-3);
        myArrayList1.add(8);
        assertEquals(myArrayList1.get(0), 4);
        assertEquals(myArrayList1.get(1), -3);
        assertEquals(myArrayList1.get(2), 8);

        myArrayList2.add("Кот");
        myArrayList2.add("Собака");
        myArrayList2.add("Мышь");
        assertEquals(myArrayList2.get(0), "Кот");
        assertEquals(myArrayList2.get(1), "Собака");
        assertEquals(myArrayList2.get(2), "Мышь");

        myArrayList3.add("Кот");
        myArrayList3.add("Собака");
        myArrayList3.add("Мышь");
        assertEquals(myArrayList3.get(0), "Кот");
        assertEquals(myArrayList3.get(1), "Собака");
        assertEquals(myArrayList3.get(2), "Мышь");
    }

    @Test
    void addForIndex() {
        myArrayList.add(55);
        myArrayList.add(99);
        myArrayList.add(84);
        myArrayList.addForIndex(4, 2);
        assertEquals(myArrayList.get(2), 4);
        assertEquals(myArrayList.get(3), 99);

        myArrayList1.addForIndex(88, 3);
        assertEquals(myArrayList1.get(3), 88);

        myArrayList2.addForIndex("Кот", 2);
        assertEquals(myArrayList2.get(2), "Кот");

        myArrayList3.addForIndex("Кот", 4);
        assertEquals(myArrayList3.get(4), "Кот");
    }

    @org.junit.jupiter.api.Test
    void delete() {
        myArrayList.add(55);
        myArrayList.add(99);
        myArrayList.add(84);
        myArrayList.add(69);
        myArrayList.add(7);
        myArrayList.delete(2);
        assertEquals(myArrayList.get(2), 69);

        myArrayList1.add(55);
        myArrayList1.add(99);
        myArrayList1.add(84);
        myArrayList1.add(69);
        myArrayList1.add(7);
        myArrayList1.delete(4);
        assertEquals(myArrayList.get(4), null);

        myArrayList2.add("Кот");
        myArrayList2.add("Собака");
        myArrayList2.add("Мышь");
        myArrayList2.add("Крот");
        myArrayList2.add("Овца");
        myArrayList2.add("Лягушка");
        myArrayList2.delete(0);
        assertEquals(myArrayList2.get(0), "Собака");

    }

    @org.junit.jupiter.api.Test
    void clear() {

        myArrayList1.add(4);
        myArrayList1.add(98);
        myArrayList1.add(64);
        myArrayList1.add(-64);
        myArrayList1.clear();
        assertEquals(myArrayList1.get(0), null);
        assertEquals(myArrayList1.get(1), null);
        assertEquals(myArrayList1.get(2), null);
        assertEquals(myArrayList1.get(3), null);

        myArrayList2.add("Кот");
        myArrayList2.add("Собака");
        myArrayList2.add("Мышь");
        myArrayList2.add("Крот");
        myArrayList2.add("Овца");
        myArrayList2.add("Лягушка");
        myArrayList2.clear();
        assertEquals(myArrayList2.get(0), null);
        assertEquals(myArrayList2.get(1), null);
        assertEquals(myArrayList2.get(2), null);
        assertEquals(myArrayList2.get(3), null);
        assertEquals(myArrayList2.get(4), null);
        assertEquals(myArrayList2.get(5), null);
    }

    @org.junit.jupiter.api.Test
    void get() {

        myArrayList1.add(4);
        myArrayList1.add(98);
        myArrayList1.add(64);
        myArrayList1.add(-64);
        assertEquals(myArrayList1.get(2), 64);

        myArrayList2.add("Кот");
        myArrayList2.add("Собака");
        myArrayList2.add("Мышь");
        myArrayList2.add("Крот");
        myArrayList2.add("Овца");
        myArrayList2.add("Лягушка");
        assertEquals(myArrayList2.get(0), "Кот");
    }
}