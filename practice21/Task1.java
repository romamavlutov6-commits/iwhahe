package practice21;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange"};
        System.out.println(arrayToList(strings));

        System.out.println();

        Integer[] integers = {0, 1, 2};
        System.out.println(arrayToList(integers));
    }
}