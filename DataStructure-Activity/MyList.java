/***
*   MyList interface
**/
public interface MyList{
   //sentinel methods
   public boolean isFull();
   public boolean isEmpty();
   //allowable operations
   public boolean addItem(Object item);
   public boolean isItem(Object item);
   public boolean deleteItem(Object item);
   public boolean insertBefore(Object item,Object newitem);
   public boolean insertAfter(Object item,Object newitem);
}//end of interface