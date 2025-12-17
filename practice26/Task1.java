package practice26;

import java.util.Stack;

public class Task1 {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // 1. Помещаем все элементы в стек
        for (int num : arr) {
            stack.push(num);
        }

        // 2. Извлекаем из стека обратно в массив (теперь в обратном порядке)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Исходный: " + java.util.Arrays.toString(array));

        reverseArray(array);
        System.out.println("Инвертированный: " + java.util.Arrays.toString(array));
    }
}