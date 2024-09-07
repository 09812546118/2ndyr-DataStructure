/***
   A program that accepts a single positive integer value
   and display the series of values from 1 to the inputted value
   ------
   example:
      input : 5
      output : 1 2 3 4 5
**/
public class First4{
   static public void main(String... agrs){
      String message="";
      System.out.print("Enter a positive(+) integer:");
      try{
         int n=new java.util.Scanner(System.in).nextInt();
         if(n>0){
            for(int i=1;i<=n;System.out.printf("%3d",i),i++);
            message="\nSuccess!";
         }
         else message="Accept only positive(+) integer";
      }
      catch(Exception e){
         message="Invalid Input";
      }
      finally{
         System.out.println(message);
      }
   }
}//end of class