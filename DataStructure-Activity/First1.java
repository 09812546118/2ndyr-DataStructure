/***
   Simple input/output program in java
   ----------------------------------
   A program that would accept two(2) integers
   compute and display the sum,difference,product and quotient
**/
public class First1{
   static public void main(String... args){
      System.out.print("Enter first value (n):");
      int a=new java.util.Scanner(System.in).nextInt();
      System.out.print("Enter Second value (n):");
      int b=new java.util.Scanner(System.in).nextInt();
      System.out.printf("The sum of %d and %d is %d\n",a,b,(a+b));
      System.out.printf("The difference of %d and %d is %d\n",a,b,(a-b));
      System.out.printf("The product of %d and %d is %d\n",a,b,(a*b));
      System.out.printf("The quotient of %d and %d is %f\n",a,b,(a*1.0f/b));
   }
}//end of class