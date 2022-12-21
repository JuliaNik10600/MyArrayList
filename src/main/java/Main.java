public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(67);
        myArrayList.add(88);
        myArrayList.add(15);
        myArrayList.add(23);
        myArrayList.read();

        myArrayList.addForIndex(6, 3);
        System.out.println(" ");
        myArrayList.read();

        myArrayList.delete(4);
        System.out.println(" ");
        myArrayList.read();

        System.out.println(" ");
        System.out.println(myArrayList.get(2));

        myArrayList.clear();
        myArrayList.read();
    }
}
