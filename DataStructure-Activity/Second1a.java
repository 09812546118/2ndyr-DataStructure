//import java.util.Scanner;
//import java.io.*;
public class Second1a{
   static String filename="myfile.txt";
   static public void main(String ...args){
      try{
         java.util.Scanner s=new java.util.Scanner(new java.io.File(filename));
         while (s.hasNextLine()){
            System.out.println(s.nextLine());
         }
         
      }catch(Exception e){
         System.out.println("Error handling file...");
      }
   }//end of main
}//end of class