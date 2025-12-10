package practice23.Task2;

public abstract class AbstractQueue implements Queue{
    protected int size;

    public AbstractQueue() {
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        return sb.toString();
    }

    protected abstract String elementsToString();
}
