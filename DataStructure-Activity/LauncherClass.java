/***
   LauncherClass
**/
public class LauncherClass{
   //create an array of DailyEmployee
   private static Employee[] employee; //array-object variable
   private static int count; //item counter
   
   private static void displayMenu(){
      String[] menuOptions={
         "------ Main Menu ------",
         "1. Create EmployeeList ",
         "2. Add Employee        ",
         "3. Display Payroll     ",
         "0. Quit/Exit           ",
         "-----------------------"
      };
      //display the menuoption using for-each loop
      for(String option:menuOptions)
      System.out.println(option);
   }
   //
   static public void main(String ...args){
      
      char opt='\u0000'; //pre-define the opt and initialize with null character('\u0000')
      while(opt!='0'){
         displayMenu();
         //display a prompt, asking the user to enter option
         System.out.print("Enter Option(0..3):");
         opt=new java.util.Scanner(System.in).nextLine().charAt(0);
         //
         switch(opt){
            case '1': //create an instance DailyEmployee and assign to the Employee array-object variable
               System.out.print("Enter number of employee(1-20):");
               try{
                  int n=new java.util.Scanner(System.in).nextInt();
                  if (n>0 && n<=20){
                     employee=new DailyEmployee[n]; //create the daily employee array
                     System.out.println("Creating "+n+" Employee container");
                  }
               }catch(Exception e){
                  System.out.println("Input Error");
               }
               break;
            case '2'://adding new employee into the employee array
                //we cannot add a new employee if the employee array is not created
                if (employee.length>0 && count<employee.length){
                  try{
                     System.out.print("IDNO       :"); String idno=new java.util.Scanner(System.in).nextLine();
                     System.out.print("LASTNAME   :"); String lastname=new java.util.Scanner(System.in).nextLine();
                     System.out.print("FIRSTNAME  :"); String firstname=new java.util.Scanner(System.in).nextLine();
                     System.out.print("AGE        :"); int age=new java.util.Scanner(System.in).nextInt();
                     System.out.print("POSITION   :"); String position=new java.util.Scanner(System.in).nextLine();
                     System.out.print("DAILY RATE :"); double daily_rate=new java.util.Scanner(System.in).nextDouble();
                     System.out.print("DAYS WORK  :"); double days_work=new java.util.Scanner(System.in).nextDouble();
                     employee[count++] = new DailyEmployee(idno,lastname,firstname,age,position,daily_rate,days_work);
                     System.out.println("New Employee Added...");
                  }
                  catch(Exception e){
                     System.out.println("Input Error");
                  }
                }
               break;
            case '3': //display the payroll
               System.out.println("Employee Payroll");
               System.out.println("------------------------------------------------------------");
               for(int i=0;i<count;i++){
                  System.out.println(employee[i]);
               }
               break;
            case '0': //terminate the application 
               System.out.println("Program Terminated....");
               System.exit(0); //gracefull termination
         }
      }
   }
}//end of class