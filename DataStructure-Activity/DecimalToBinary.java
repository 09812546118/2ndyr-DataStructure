public class DecimalToBinary{
   
   private String decimal;
   //constructor
   public DecimalToBinary(String decimal){
      this.decimal=decimal;
   }
   //conversion method
   private String binary(){
      String result="";
      try{
         if(decimal!=null){
            int n=Integer.parseInt(decimal); // convert the String to integer using wrapper class
            String[] r=new String[8];  //8 bits
            int i=0;
            //
            while(n>0 && i>-1){
               int remainder = n % 2;  //get only the remainder
               r[i++]=remainder+" ";
               n/=2; // n=n/2
            }
            for(i=r.length-1;i>-1;i--)
               if(r[i]!=null)
                  result+=r[i];
         }
      }catch(Exception e){
         return result;
      }
      return result;
   }
   
   public String toString(){
      return binary();
   }
   
   //
   static public void main(String ...args){
      String filename="myvalues.txt";
      DecimalToBinary dcb=null;
      try{
         java.util.Scanner scanner=new java.util.Scanner(new java.io.File(filename));         
         while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            dcb=new DecimalToBinary(s);
            System.out.println(s+" = "+dcb);
         }
      }catch(Exception e){
         System.out.println("Cannot read file");
      }
   }
   
}//end of class