/***
   MySetArray - array implementation of Myset ADT
***/
public class MySetArray implements Myset{
      //define the data container
      private Object[] items;
      //define the utility variables
      public int cardinality; //count of the element in the set
      
      //define the constructor
      public MySetArray(String... s){
         //instantiate the data container
         items=new Object[s.length];
         //populate the array
         for(String st:s)
            items[cardinality++]=st; 
      }
      public MySetArray(int size){ items=new Object[size];}
      //default constructor
      public MySetArray()        { this(10); } // if no size define, set max items to 10 elements
      //override the toString() method
      public String toString(){
         StringBuffer sb=new StringBuffer();
            sb.append("{");
            for(int i=0;i<cardinality;i++){
               sb.append(items[i]);
               //place a delimeter (separator symbol in between item)
               if(i<cardinality-1)
                  sb.append(",");
            }
            sb.append("}");
         return sb.toString();
      }
      //define the sentine methods
      public boolean isEmpty()            { return cardinality==0; }
      public boolean isFull()             { return cardinality==items.length;}
      //define the utility methods
      public boolean isItem(Object item){
         boolean found=false;
            if(!isEmpty()){
               //sequential search implementation, use an iterative loop
               for(int i=0;i<cardinality;i++){
                  if(items[i].equals(item)){
                     found=true;
                     break;
                  }
               }
            }
         return found;
      }  
      public boolean addItem(Object item){
         boolean ok=!isItem(item) && !isFull();
            if(ok) items[cardinality++]=item;
         return ok;
      }
      //allowable operations
      public Myset union(Myset s){
         MySetArray paramSet=(MySetArray)s;
         String[] paramItems=new String[paramSet.cardinality];
         java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
         int index=0;
         while(st.hasMoreTokens())
            paramItems[index++]=st.nextToken();
         //define the result set 
         int size=cardinality+paramSet.cardinality;
         Myset result=new MySetArray(size);  
         //populate the result set
            for(int i=0;i<cardinality;result.addItem(items[i]),i++); 
            for(int i=0; i<paramSet.cardinality;result.addItem(paramItems[i]),i++);
         return result;
      }
      public Myset intersect(Myset s){
         MySetArray paramSet=(MySetArray)s;
         int size=(cardinality<paramSet.cardinality)?cardinality:paramSet.cardinality;
         Myset result=new MySetArray(size);
            for(int i=0;i<cardinality;i++){
               if(paramSet.isItem(items[i]))
                  result.addItem(items[i]);
            }
         return result;
      }        
      public Myset subtract(Myset s){
       MySetArray paramSet=(MySetArray)s;
       int size=(cardinality<paramSet.cardinality)?cardinality:paramSet.cardinality;
       Myset result=new MySetArray(size);
            for(int i=0;i<cardinality;i++){
               if(!paramSet.isItem(items[i]))
                  result.addItem(items[i]);
            }
         return result;
   
         
      }
      public Myset crossProduct(Myset s){
        MySetArray paramSet=(MySetArray)s;
        String[] paramItems=new String[paramSet.cardinality];
        java.util.StringTokenizer st=new java.util.StringTokenizer(paramSet.toString(),"{},");
         int index=0;
         while(st.hasMoreTokens())
            paramItems[index++]=st.nextToken();
         //define the result set 
         int size=cardinality*paramSet.cardinality;
        Myset result=new MySetArray(size); 
            //populate the  result set
            for(int i=0;i<cardinality;i++){
               for(int j=0;j<paramSet.cardinality;j++){
                  MySetArray temp=new MySetArray(2);
                     temp.addItem(items[i]);
                     temp.addItem(paramItems[j]);
                     if(temp.cardinality==2)
                        result.addItem(temp);
               }
            }
            
        return result; 
      }

      
}//end of class