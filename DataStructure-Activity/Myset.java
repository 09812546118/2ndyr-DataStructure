/***
 MySet interface
**/
public interface Myset{
   //define the sentine methods
   public boolean isEmpty();
   public boolean isFull();
   //define the utility methods
   public boolean isItem(Object item);
   public boolean addItem(Object item);
   //allowable operations
   public Myset union(Myset s);
   public Myset intersect(Myset s);
   public Myset subtract(Myset s);
   public Myset crossProduct(Myset s);
}//end of intreface