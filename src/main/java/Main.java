package main.java;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();
        Integer[] arr = {1,2,3,4,5};
        list.add(5);
        list.addAll(arr);
        System.out.println(list.get(2));
        System.out.println(list.getSize());
        list.sort();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
