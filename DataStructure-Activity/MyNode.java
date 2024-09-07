/***
   Node class - this class will facilitate the data container of the linked-based implementation
   of the MyStack interface or any linear data structure
**/

// Define the MyNode class
public class MyNode {
    private Object item;
    private MyNode next;

    public MyNode(Object item) {
        this.item = item;
        this.next = null;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
 