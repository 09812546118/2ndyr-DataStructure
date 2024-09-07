public class MyQueueLinked2 implements MyQueue {
    // Define the container
    private MyNode head, tail;
    // Define utility attributes
    private int count;

    // Constructor is not required

    // Sentinel methods
    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // Allowable operations
    public boolean enqueue(Object item) {
        // Create an instance of the MyNode class, set the item as the data
        MyNode node = new MyNode(item);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        count++;
        return true;
    }

    public Object peek() {
        return (!isEmpty()) ? head.getItem() : null;
    }

    public Object dequeue() {
        Object item = peek();
        if (item != null) {
            MyNode node = head;
            head = head.getNext();
            node = null; // help garbage collector
            count--;
        }
        return item;
    }

    // Utility methods
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public int size() {
        return count;
    }

    // Override the toString() method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MyNode node = head; node != null; node = node.getNext()) {
            sb.append(node.getItem()).append(" ");
        }
        return sb.toString().trim();
    }
}
