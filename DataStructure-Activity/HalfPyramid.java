//half-pyramid exercise
public class HalfPyramid{
   static public void main(String ...args){
      System.out.print("Enter a value(3,6,10,15):");
      try{
         int n=new java.util.Scanner(System.in).nextInt();
         int count=1;
         //check for condition
         if(n==3 || n==6 || n==10 || n==15){ //established rule
            for(int i=1;count<=n;i++){
               for(int j=1;j<=i;j++){
                  System.out.printf("%4d",count++);
               }
               System.out.println();
            }
         }
         else {
            System.out.println("Accepts only 3,6,10,15");
         }
      }catch(Exception e){
         System.out.println("Input Error");
      }
   }//end of main method
}//end of class