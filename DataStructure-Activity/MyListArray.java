/***
   MyListArray - array implementation of the MyList interface
**/
public class MyListArray implements MyList{
   //define data container
   private Object[] list;
   //define utility variable
   private int count,position;
   
   //constructors
   public MyListArray(int size)  { this.list = new Object[size];}
   //default constructor
   public MyListArray()          { this(10); } //default size is set to ten(10) elements
   //
   //sentinel methods
   public boolean isFull()       { return count==list.length; }
   public boolean isEmpty()      { return count==0;}
   //allowable operations
   public boolean addItem(Object item){ //new item added next to the last element
      boolean ok=!isFull();
         if(ok)  list[count++]=item;
      return ok;
   }
   public boolean isItem(Object item){
      boolean ok=!isEmpty();
      boolean found=false;
         //sequential search - traditional search method, no sorting needed linear search
         //O(n) complexity
         for(int i=0;i<count;i++){
            if(item.equals(list[i])){
               found=true;
               position=i;
               break;
            }
         }
      return found;
   }
   public boolean deleteItem(Object item){
      boolean ok=isItem(item);
         if(ok){
            //use the textbook type
            for(int i=position;i<count;list[i]=list[i+1],i++);
            count--;
         }
      return ok;
   }
   public boolean insertBefore(Object item,Object newitem){
      boolean ok=isItem(item);
         for(int i=count;i>position;list[i]=list[i-1],i--);
         list[position]=newitem;
         count++;
      return ok;
   }
   public boolean insertAfter(Object item,Object newitem){
      boolean ok=isItem(item);
         for(int i=count;i>position+1;list[i]=list[i-1],i--);
         list[position+1]=newitem;
         count++;
      return ok;
   }
   //
   public String toString(){
      StringBuffer sb=new StringBuffer();
         for(int i=0;i<count;i++){
            sb.append(list[i]);
            if(i<count-1)
               sb.append(",");
         }
      return sb.toString();
   }
}//end of class