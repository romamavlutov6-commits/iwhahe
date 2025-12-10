package practice21;

import java.util.Arrays;

public class Task23 {

    public static class GenericArray<T> {
        private T[] array;

        // принянить масив
        public GenericArray(T[] array) {
            this.array = array;
        }

        // 3нмоер
        public T get(int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Индекс: " + index +
                        ", допустимый диапазон: [0, " + (array.length - 1) + "]");
            }
            return array[index];
        }

        // размер масива
        public int size() {
            return array.length;
        }

        // масив -> стр
        @Override
        public String toString() {
            return Arrays.toString(array);
        }
    }

    public static void main(String[] args) {
        // чилса
        Integer[] integers = {12, 223, 41};
        GenericArray<Integer> intArray = new GenericArray<>(integers);
        System.out.println("Массив Integer: " + intArray);
        System.out.println("Элемент с индексом 0: " + intArray.get(0));
        System.out.println("Элемент с индексом 2: " + intArray.get(2));
        System.out.println("Размер массива: " + intArray.size());

        System.out.println();

        // стр
        String[] strings = {"apple", "banana", "orange"};
        GenericArray<String> strArray = new GenericArray<>(strings);
        System.out.println("Массив String: " + strArray);
        System.out.println("Элемент с индексом 1: " + strArray.get(1));
        System.out.println("Размер массива: " + strArray.size());

        //eror
        try {
            System.out.println("Попытка получить элемент с индексом 5: " + strArray.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}