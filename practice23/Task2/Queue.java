package practice23.Task2;

public interface Queue {
    void enqueue(int element);
    int element();
    int dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
