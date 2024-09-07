/***
   MyStack interface - established the standard naming convention of the implementing stack classes
**/
public interface MyStack{
   //agreed method names for this stack
   //sentinel methods - this watchdog methods(check the status of the data container(full/empty))
   //                   commmonly used in linear DS
   public boolean isEmpty(); // check the status of the data container
   public boolean isFull(); //very important when the data container is an array-based container
   //ALLOWABLE OPERATIONS
   public boolean push(Object item);
   public Object peek();
   public Object pop();
}//end of interface