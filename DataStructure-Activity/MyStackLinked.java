/***
   MyStackLinked - linked-based implementation of the MyStack interface
**/
public class MyStackLinked implements MyStack{
   
   //define the data container 
   private Node top;
   //usually linked-based DS, constructor could optional
   public boolean isEmpty()      { return top == null; }
   public boolean isFull()       { return false; } //linked-based dynamic, does not logically get full   
   //ALLOWABLE OPERATIONS
   public boolean push(Object item){
      Node node = new Node(item);
      /*if (isEmpty()){
         top = node;
      }
      else{
         node.setNext(top);
         top = node;
      }*/
      if (!isEmpty()){
         node.setNext(top);
      }
      top = node;
      return true;
   }
   public Object peek(){
      /*Object item = null;
      if(!isEmpty()){
         item = top.getItem();
      }
      return item;*/
      return (!isEmpty())?top.getItem():null;
   }
   public Object pop(){
      Object item = peek();
      if(item!=null){
         Node temp = top;
         top = temp.getNext();
         temp = null;
      }
      return item;
   }
   //override the toString() method
   public String toString(){
      StringBuffer sb = new StringBuffer();
         //NOTE: stack is last-in, first-out
         Node temp = top;
         while(temp!=null){
            sb.append(temp.getItem());
            temp=temp.getNext(); //iterate the traversing node pointer (temp)
         }
      return sb.toString();
   }
}//end of class