/***
   MyListLinked - a linked-list implementation of the MyList interface
**/
public class MyListLinked implements MyList{
   //define the data container
   private Node head,tail;
   //utility variable
   private int count;
   
   //we will just used the JVM delegated constructor
   //sentinel methods
   public boolean isFull()                   { return false; } //MyListLinked unlimited data
   public boolean isEmpty()                  { return count==0; }
   //allowable operations
   public boolean addItem(Object item){
      //create a instance of the Node class
      Node node=new Node(item);
         if(!isEmpty())  tail.setNext(node);
         else            head=node;
            tail=node;
            count++;
      return true;
   }
   public boolean isItem(Object item){
      //can only use sequential search
      boolean found=false;
         if(!isEmpty()){
            /*
            Node temp=head;   //create a temporary traversing node pointer
            while(temp!=null){
               //test the temp value
               if(temp.getItem().equals(item)){
                  found=true;
                  break;
               }
               temp=temp.getNext(); //iterate the traversing node
            }*/
            for(Node temp=head;temp!=null;temp=temp.getNext()){
               //test the temp value
               if(temp.getItem().equals(item)){
                  found=true;
                  break;
               }
            }
         }
      return found;
   }
   public boolean deleteItem(Object item){
      boolean ok=isItem(item);
      Node temp = null;
        if(ok){
            temp=head;
            //case 1: if the item to be removed is the HEAD
            if(temp.getItem().equals(item)){
               head=temp.getNext();
               temp=null;
            }
            else{
            //search the item to be removed which is after the HEAD
            //create another temporary pointer nextemp pre-setted to the next of temp pointer
              Node nextemp=temp.getNext();
              while(temp!=null){
                  if(nextemp.getItem().equals(item)){
                     if(nextemp==tail){
                        tail=temp;
                        tail.setNext(null);
                     }
                     else{
                        temp.setNext(nextemp.getNext());
                     }
                     nextemp=null;
                     break;
                  }
                  temp=temp.getNext();
                  nextemp=temp.getNext();
              }      
            }
            count--;
         }
      return ok;
   }
   public boolean insertBefore(Object item,Object newitem){ return false;}
   public boolean insertAfter(Object item,Object newitem){ return false;}
   //
   public String toString(){
      StringBuffer sb=new StringBuffer();
         for(Node temp=head;temp!=null;temp=temp.getNext()){
            sb.append(temp.getItem());
            if(temp.getNext()!=null)
               sb.append(",");
         }
      return sb.toString();
   }
}//end of class