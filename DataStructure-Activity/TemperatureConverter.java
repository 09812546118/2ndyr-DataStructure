import java.util.*;
import javax.swing.*;

public class TemperatureConverter {
   public static void main(String...args) {
      Scanner in = new Scanner(System.in);
      int type = 0;
      double valueToBeConverted = 0, convertedValue = 0;
      String reactionMessage = "", conversionLabel = "";
      
      System.out.println("Conversion types: 1 = C->F, 2 = F->C");
      System.out.print("Select conversion type: ");
            
      try {
         type = in.nextInt();
         if (type != 1 && type != 2)
            throw (new Exception("Invalid"));
         
         String label = type == 1 ? "Celcius" : "Fahrenheit";
         System.out.print(label + ": ");
         valueToBeConverted = in.nextDouble();
         convertedValue = type == 1 ? ((valueToBeConverted * 1.8) + 32) : ((valueToBeConverted - 32) / 1.8);
         reactionMessage = (type == 2 && convertedValue < 21) || (type == 1 && convertedValue < 69.8)
               ? "Brrr.. that's cold" 
               : (type == 2 && convertedValue >= 21 && convertedValue <= 37) || (type == 1 && convertedValue >= 69.8 && convertedValue <= 96.8)
                  ? "Alright, that temperature is just right"
                  : "Sheeesh! that's burning hot!";
         conversionLabel = type == 1 ? "Celcius - Fahrenheit" : "Fahrenheit - Celcius";   
      }
      catch (Exception e) {
         System.out.println("Invalid input! Please try again.");
         return;
      }
      
      JOptionPane.showMessageDialog(null, "Converted: " + conversionLabel + "  \nFrom: " + valueToBeConverted + " \nTo: " + convertedValue, reactionMessage, JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
   }
}