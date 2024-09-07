/***
   Simple input/output program in java
   ----------------------------------
   A program that would accept two(2) integers
   compute and display the sum,difference,product and quotient
   Using method
**/
public class First2{
   public static int add(int a,int b)        { return a+b; }
   public static int subtract(int a,int b)   { return a-b;}
   public static int multiply(int a,int b)   { return a*b; }
   public static double divide(int a,int b)  { return (a*1.0)/b; }
   ///
   static public void main(String... args){
      System.out.print("Enter first value:");
      int a=new java.util.Scanner(System.in).nextInt();
      System.out.print("Enter second value:");
      int b=new java.util.Scanner(System.in).nextInt();
      System.out.printf("The sum of %d and %d is %d\n",a,b,add(a,b));
      System.out.printf("The difference of %d and %d is %d\n",a,b,subtract(a,b));
      System.out.printf("The product of %d and %d is %d\n",a,b,multiply(a,b));
      System.out.printf("The quotient of %d and %d is %f",a,b,divide(a,b));
   }
}//end of class