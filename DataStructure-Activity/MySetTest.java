/**
   MySetTest- set test class
***/
public class MySetTest{
   static public void main(String... args){
      MySetLinked setA=new MySetLinked(new String[]{"a","b","c","d","e"});
      MySetLinked setB=new MySetLinked(new String[]{"d","e","f","g"});
      System.out.println("Set A="+setA);
      System.out.println("Set B="+setB);
      System.out.println("Set AUB="+setA.union(setB)); 
      System.out.println("Set A^B="+setA.intersect(setB)); 
      System.out.println("Set A-B="+setA.subtract(setB)); 
      System.out.println("Set B-A="+setB.subtract(setA));
      System.out.println("Set AxB="+setA.crossProduct(setB));
   }
}//end of class