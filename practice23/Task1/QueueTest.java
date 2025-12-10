package practice23.Task1;

public class QueueTest {
    public static void main(String[] args) {
        System.out.println("=== Тестирование ArrayQueueModule ===");

        // 1. ArrayQueueModule
        Task1.ArrayQueueModule.clear();

        Task1.ArrayQueueModule.enqueue(1);
        Task1.ArrayQueueModule.enqueue(2);
        Task1.ArrayQueueModule.enqueue(3);

        System.out.println("Размер: " + Task1.ArrayQueueModule.size());
        System.out.println("Первый элемент: " + Task1.ArrayQueueModule.element());
        System.out.println("Удаляем: " + Task1.ArrayQueueModule.dequeue());
        System.out.println("Теперь размер: " + Task1.ArrayQueueModule.size());

        System.out.println("\ntest ArrayQueue");

        // 2. ArrayQueue
        Task1.ArrayQueue queue = new Task1.ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Размер: " + queue.size());
        System.out.println("Первый: " + queue.element());
        System.out.println("Удаляем: " + queue.dequeue());
        System.out.println("Теперь первый: " + queue.element());

        System.out.println("clear");
        queue.clear();
        System.out.println("Пустая? " + queue.isEmpty());

        System.out.println("\nArrayQueueADT");

        // 3. ArrayQueueADT
        Task1.ArrayQueueADT adtQueue = new Task1.ArrayQueueADT(5);

        Task1.ArrayQueueADT.enqueue(adtQueue, 100);
        Task1.ArrayQueueADT.enqueue(adtQueue, 200);

        System.out.println("Размер: " + Task1.ArrayQueueADT.size(adtQueue));
        System.out.println("Первый: " + Task1.ArrayQueueADT.element(adtQueue));

        System.out.println("\nПроверка ошибок");

        try {
            Task1.ArrayQueueADT.dequeue(adtQueue);
            Task1.ArrayQueueADT.dequeue(adtQueue);
            Task1.ArrayQueueADT.dequeue(adtQueue); // Должна быть ошибка
        } catch (IllegalStateException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("\nend");
    }
}