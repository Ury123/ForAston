package main.java;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T array[];

    public MyArrayList() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int inputSize) {
        this.array = (T[]) new Object[inputSize];
    }

    public void add(T element) {
        if (size == array.length) {
            array = resize();
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        return array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void addAll(T[] elements) {
        for (T el : elements) {
            add(el);
        }
    }

    public void sort() {
        boolean sorted;
        for (int i = 0; i < size - 1; i++) {
            sorted = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) array[j]).compareTo(array[j + 1]) > 0) {

                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = true;
                }
            }

            if (!sorted)
                break;
        }
    }



    public int getSize() {
        return size;
    }

    private T[] resize() {
        T[] newArray = (T[]) new Object[array.length*2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
