package practice23.Task1;

public class Task1 {
    public class ArrayQueueModule {
        private static final int DEFAULT_CAPACITY = 10;
        private static int[] items;
        private static int front;
        private static int rear;
        private static int size;
        private static int capacity;

        static {
            capacity = DEFAULT_CAPACITY;
            items = new int[capacity];
            front = 0;
            rear = 0;
            size = 0;
        }

        public static void enqueue(int element) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            items[rear] = element;
            rear = (rear + 1) % capacity;
            size++;
        }


        public static int element() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return items[front];
        }

        public static int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = items[front];
            front = (front + 1) % capacity;
            size--;
            return element;
        }

        public static int size() {
            return size;
        }

        public static boolean isEmpty() {
            return size == 0;
        }

        public static void clear() {
            front = 0;
            rear = 0;
            size = 0;
        }

        private static boolean isFull() {
            return size == capacity;
        }

        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                sb.append(items[index]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class ArrayQueueADT {
        private int[] items;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public ArrayQueueADT() {
            this(10);
        }

        public ArrayQueueADT(int capacity) {
            this.capacity = capacity;
            this.items = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        public static void enqueue(ArrayQueueADT queue, int element) {
            if (isFull(queue)) {
                throw new IllegalStateException("Queue is full");
            }
            queue.items[queue.rear] = element;
            queue.rear = (queue.rear + 1) % queue.capacity;
            queue.size++;
        }

        public static int element(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                throw new IllegalStateException("Queue is empty");
            }
            return queue.items[queue.front];
        }

        public static int dequeue(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = queue.items[queue.front];
            queue.front = (queue.front + 1) % queue.capacity;
            queue.size--;
            return element;
        }

        public static int size(ArrayQueueADT queue) {
            return queue.size;
        }

        public static boolean isEmpty(ArrayQueueADT queue) {
            return queue.size == 0;
        }

        public static void clear(ArrayQueueADT queue) {
            queue.front = 0;
            queue.rear = 0;
            queue.size = 0;
        }

        private static boolean isFull(ArrayQueueADT queue) {
            return queue.size == queue.capacity;
        }

        public static String toString(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < queue.size; i++) {
                int index = (queue.front + i) % queue.capacity;
                sb.append(queue.items[index]);
                if (i < queue.size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class ArrayQueue {
        private int[] items;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public ArrayQueue() {
            this(10);
        }

        public ArrayQueue(int capacity) {
            this.capacity = capacity;
            this.items = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        public void enqueue(int element) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            items[rear] = element;
            rear = (rear + 1) % capacity;
            size++;
        }

        public int element() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return items[front];
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = items[front];
            front = (front + 1) % capacity;
            size--;
            return element;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void clear() {
            front = 0;
            rear = 0;
            size = 0;
        }

        private boolean isFull() {
            return size == capacity;
        }

        @Override
        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                sb.append(items[index]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}


