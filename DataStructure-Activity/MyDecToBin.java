//my decimal to binary
//using bitwise operator
public class MyDecToBin{
   static public void main(String ...args){
      try{
         System.out.print("Enter an integer(0..255):");
         //console input
         int n=new java.util.Scanner(System.in).nextInt();
         //
         for(int i=0,shift=7;i<8;shift--,i++){
            int bit = n >> shift;
            bit &= 0x01; //masking to make it true binary value
            System.out.printf("%d",bit);
         }
         
      }catch(Exception e){
         System.out.println("Input Error");
      }
   }
}//end of class