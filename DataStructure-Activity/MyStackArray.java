/***
   MyStackArray - array-based implementation of the MyStack interface
**/
public class MyStackArray implements MyStack {
   //define the data container
   private Object[] item;
   private int top; 
   
   //constructor
   public MyStackArray(int size){
      this.item = new Object[size];
   }
   //default constructor
   public MyStackArray(){
      this(10); //default size = 10 elements
   }
   //
   public boolean isEmpty()   { return top == 0; }
   public boolean isFull()    { return top == item.length; } 
   //ALLOWABLE OPERATIONS
   public boolean push(Object item){
      boolean ok=!isFull();
         if(ok)
            this.item[top++] = item;
      return ok;   
   }
   public Object peek(){
      /**Object item=null;
         if(!isEmpty()){
            item=this.item[top-1];
         }
      return item;**/
      //using ternary operator
      return (!isEmpty())?item[top-1]:null;
   }
   public Object pop(){
      Object item=peek();
         if(item!=null){
            /*this.item[top]=null;
            top--;*/
            this.item[--top]=null;   
         }
      return item;
   }
   //override(replace the inherited method) the toString() method
   public String toString(){
      //NOTE: Stack is LIFO(last-in first-out)
      StringBuffer sb=new StringBuffer(); //mutable String 
         /*for(int i=top;i>-1;i--){ //decrementing iteration
            sb.append(item[i]);
         }*/
         for(int i=top-1;i>-1;sb.append(item[i]),i--);
      return sb.toString(); //convert StringBuffer to a String
   }
   
}//end of class