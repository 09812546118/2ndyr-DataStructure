/*
   MyQueueLinked - linked-list implementation of the MyQueue ADT
*/
public class MyQueueLinked implements MyQueue{
   //define data container
   private Node head,tail;
   //define utility attributes
   private int count;
   
   //constructors is not required 
   //sentinel methodsca
   public boolean isFull()       {return false; }
   public boolean isEmpty()      {return count==0; }
   //allowable resources
   public boolean enqueue(Object item){
      //create an instance of the MyNode class,set the item as the data
      Node node=new Node(item);
      if(isEmpty()) head=node;
      else          tail.setNext(node);
         tail=node;
         count++;
      return true;   
   }
   public Object peek()    {return(!isEmpty())?head.getItem():null;}
   public Object dequeue(){
      Object item=peek();
         if(item!=null){
            Node node=head;
            head=node.getNext();
            node=null;
            count--;
         }
      return item;
   }
   //Utility methods
   public void clear(){
      for(;!isEmpty();dequeue());
   }
   public int size(){
      return count;
   }
   //override the String method
   public String toString(){
      StringBuffer sb=new StringBuffer();
         for(Node node=head;node!=null;sb.append(node.getItem()),node=node.getNext());
         return sb.toString();
   }
}//end of class