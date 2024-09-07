/***
   Node class - this class will facilitate the data container of the linked-based implementation
   of the MyStack interface or any linear data structure
**/
public class Node{
   //define object variables
   private Object item;
   private Node next;
   
   //constructors
   public Node(Object item)            { this.item=item; }
   public Node()                       {}
   //setters
   public void setItem(Object item)    { this.item=item; }
   public void setNext(Node next)      { this.next = next; }
   //getters
   public Object getItem()             { return item; }
   public Node getNext()               { return next; }
}//end of class