package practice26;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task2 <T> implements Iterable<T> {
    private Object[] elements;
    private int size;

    public Task2(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size < elements.length) {
            elements[size++] = element;
        }
    }


    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    // Внутренний класс итератора
    private class CustomIterator implements Iterator<T> {
        private int currentIndex = 0;


        public boolean hasNext() {
            return currentIndex < size;
        }


        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[currentIndex++];
        }
    }

    public static void main(String[] args) {
        Task2<String> list = new Task2<>(5);
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}