/**
   MySetLinked - 
**/
public class MySetLinked implements Myset{
   //define the data container
  private MyNode head,tail;
  public int cardinality; //count of the element in the set
  
  //constructors
  public MySetLinked(String... s){//accepts an array of string
      for(int i=0;i<s.length;i++){
         MyNode node =new MyNode(s[i]);
         if(head==null && tail==null)   head=node;
         else                           tail.setNext(node);
            tail=node;
            cardinality++;
      }
  }
  //default constructor
  public MySetLinked(){}
  //override the toString() method
  public String toString(){
      StringBuffer sb=new StringBuffer();
         sb.append("{");
            for(MyNode node=head;node!=null;node=node.getNext()){
               sb.append(node.getItem());
                  if(node.getNext()!=null)
                  sb.append(",");
            }
         sb.append("}");
      return sb.toString();    
  }
  //define the sentine methods
   public boolean isEmpty()               {  return cardinality==0; }
   public boolean isFull()                {  return false; }
   //define the utility methods
   public boolean isItem(Object item){
      boolean found=false;
        if(!isEmpty()){
           for(MyNode node=head;node!=null;node=node.getNext()){
               if(item.equals(node.getItem())){
                  found=true;
                  break;
               }
           }
        }
      return found;
   }
   public boolean addItem(Object item){
      MyNode node=null;
      boolean ok=!isItem(item);
         if(ok){
            node=new MyNode(item);
            if(isEmpty())       head=node;
          else                  tail.setNext(node);
                tail=node;
                cardinality++;
         }
         
      return ok;
   }
   //allowable operations
   public Myset union(Myset s){
      MySetLinked paramSet=(MySetLinked)s;
      String[] paramItems=new String[paramSet.cardinality];
      java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
      int index=0;
      for(;st.hasMoreTokens();paramItems[index++]=st.nextToken());
      Myset result=new MySetLinked();
     //  while(st.hasMoreTokens()){
//          paramsItems[index++]=st.nextToken():
//       }
         //populate the set linked
         for(MyNode node=head;node!=null;result.addItem(node.getItem()),node=node.getNext());
        //  for(MyNode node=head;node!=null;node=node.getNext()){
//             result.addItem(node.getItem());
//          }
         for(String str:paramItems)    result.addItem(str);
               
      return result;
   }
   public Myset intersect(Myset s){
      MySetLinked paramSet=(MySetLinked)s;  
      Myset result =new MySetLinked();
         for(MyNode node=head;node!=null;node=node.getNext()){
            if(paramSet.isItem(node.getItem())){
               result.addItem(node.getItem());
            }   
         }
      return result;
   }
   public Myset subtract(Myset s){
      MySetLinked paramSet=(MySetLinked)s;  
      Myset result =new MySetLinked();
         for(MyNode node=head;node!=null;node=node.getNext()){
            if(!paramSet.isItem(node.getItem())){
               result.addItem(node.getItem());
            }   
         }
      return result;
  
   
   }
   public Myset crossProduct(Myset s){
      MySetLinked paramSet=(MySetLinked)s;
      String[] paramItems=new String[paramSet.cardinality];
      java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
      int index=0;
      for(;st.hasMoreTokens();paramItems[index++]=st.nextToken());
      Myset result=new MySetLinked();
         //populate the result set
         for(MyNode node=head;node!=null;node=node.getNext()){
             for(int i=0;i<paramItems.length;i++){
               MySetLinked temp=new MySetLinked();
                  temp.addItem(node.getItem());
                  temp.addItem(paramItems[i]);
                  if(temp.cardinality==2)
                     result.addItem(temp);
             }
         }
      return result;
   }

}//end of class