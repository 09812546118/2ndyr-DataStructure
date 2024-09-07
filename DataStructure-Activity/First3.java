/***
   Simple input/output program in java
   ----------------------------------
   A program that would accept two(2) integers
   compute and display the sum,difference,product and quotient
   Using method, and menu
**/
public class First3{
   
   private static int a,b;
   
   public static int add(int a,int b)        { return a+b; }
   public static int subtract(int a,int b)   { return a-b;}
   public static int multiply(int a,int b)   { return a*b; }
   public static double divide(int a,int b)  { return (a*1.0)/b; }
   //
   public static void displayMenu(){
      String[] menuItem={
           "----- Main Menu -----",
           "1. Add",
           "2. Subtract",
           "3. Multiply",
           "4. Divide",
           "0. Quit/Exit",
           "----------------------"
      };
      //display the content of the array
      for(String s:menuItem) System.out.println(s);   
   }
   
   public static void input(){
      System.out.print("First Value :");
      a=new java.util.Scanner(System.in).nextInt();
      System.out.print("Second Value :");
      b=new java.util.Scanner(System.in).nextInt();
   }
   
   
   //
   static public void main(String... args){
      char ch='\u0000';
      while(ch!='0'){
         displayMenu();
         System.out.print("Enter Option(0..4):");
         ch=new java.util.Scanner(System.in).nextLine().charAt(0);
         switch(ch){
            case '1': 
               System.out.println("Adding Method");
               System.out.println("-------------");
               input();               
               System.out.printf("The Sum : %d\n",add(a,b));
               
               break;
            case '2': 
               System.out.println("subtracting Method");
               System.out.println("-------------");
               input();               
               System.out.printf("The Difference : %d\n",subtract(a,b));

               break;
            case '3': 
               System.out.println("Multiplication Method");
               System.out.println("-------------");
               input();               
               System.out.printf("The Product : %d\n",multiply(a,b));
               break;
            case '4': 
               System.out.println("Division Method");
               System.out.println("-------------");
               input();               
               System.out.printf("The Quotient : %f\n",divide(a,b));
              
               break;
            case '0': 
               System.out.println("Program is Terminated...");
               System.exit(0); 
         }
      }
   }
}//end of class