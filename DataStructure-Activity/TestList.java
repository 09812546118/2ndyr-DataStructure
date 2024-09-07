/***
   Test List
**/
public class TestList{
   static public void main(String ...args){
      MyList list = new MyListArray();
         list.addItem(new String("A"));
         list.addItem(new String("B"));
         list.addItem(new String("C"));
         list.addItem(new String("D"));
         list.addItem(new String("E"));
         System.out.println(list);
         System.out.println("Delete Item: B");
         list.deleteItem(new String("B"));
         System.out.println(list);
         System.out.println("Insert Z after C");
         list.insertAfter(new String("C"),new String("Z"));
         System.out.println(list);
         System.out.println("Insert X before C");
         list.insertBefore("C","X");
         System.out.println(list);
   }
}//end of class