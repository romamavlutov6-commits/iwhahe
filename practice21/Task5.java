package practice21;

import java.util.*;

public class Task5 {

    public static class Solution<T, K, V> {
        private T t;
        private K k;
        private V v;

        public Solution(T t, K k, V v) {
            this.t = t;
            this.k = k;
            this.v = v;
        }

        @SafeVarargs
        public static <T> ArrayList<T> newArrayList(T... items) {
            ArrayList<T> list = new ArrayList<>();
            for (T item : items) {
                list.add(item);
            }
            return list;
        }

        @SafeVarargs
        public static <T> HashSet<T> newHashSet(T... items) {
            HashSet<T> set = new HashSet<>();
            for (T item : items) {
                set.add(item);
            }
            return set;
        }

        public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
            if (keys.length != values.length) {
                throw new IllegalArgumentException("колл ключей != колл знач!");
            }

            HashMap<K, V> map = new HashMap<>();
            for (int i = 0; i < keys.length; i++) {
                map.put(keys[i], values[i]);
            }
            return map;
        }

        public void printValues() {
            System.out.println("T: " + t + ", K: " + k + ", V: " + v);
        }
    }

    public static void main(String[] args) {

        System.out.println(" newArrayList");
        ArrayList<String> stringList = Solution.newArrayList("Яблоко", "Банан", "Апельсин");
        System.out.println("строки: " + stringList);

        ArrayList<Integer> numberList = Solution.newArrayList(10, 20, 30);
        System.out.println("чисела: " + numberList);

        System.out.println(" newHashSet");
        HashSet<Integer> numberSet = Solution.newHashSet(1, 2, 3, 3, 2, 1);
        System.out.println("чисела без дублей: " + numberSet);

        System.out.println("\n newHashMap ");
        String[] keys = {"Имя", "Возраст", "Город"};
        Object[] values = {"Анна", 25, "Москва"};

        HashMap<String, Object> personMap = Solution.newHashMap(keys, values);
        System.out.println("HashMap: " + personMap);

        System.out.println("\n Solution");
        Solution<String, Integer, Double> solution = new Solution<>("Текст", 100, 3.14);
        solution.printValues();

        System.out.println("\nошибка");
        try {
            String[] shortKeys = {"Один", "Два"};
            Integer[] longValues = {1, 2, 3}; // На один элемент больше!
            HashMap<String, Integer> wrongMap = Solution.newHashMap(shortKeys, longValues);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймана ошибка: " + e.getMessage());
        }
    }
}