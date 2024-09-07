/***
   A program that would accept a positive integer value not greater
   than 10, display the multiplication table matrix
   --------
   Example:
      input : 5
      1  2  3  4   5
      2  4  6  8  10
      3  6  9  12 15
      4  8 12  16 20
      5 10 15  20 25
**/
public class First5{
   static public void main(String... args){
      String message="";
      //prompt
      System.out.print("Enter a positive(+) integer(1..10):");
      try{
         int n=new java.util.Scanner(System.in).nextInt();
         //validate
         if(n>0 && n<=10){
            //display the multiplication matrix
            //nested loop
            for(int i=1;i<=n;i++){
               //inner loop
               for(int j=1;j<=n;j++){
                  System.out.printf("%4d",(i*j));
               }
               System.out.println(); //nextline of the matrix
            }
         }
         else message="Accept only positive(+) value not greater than 10";
      
      }catch(Exception e){
         message="Input Error";
      }
      finally{
         System.out.print(message);
      }
   }
}//end of class