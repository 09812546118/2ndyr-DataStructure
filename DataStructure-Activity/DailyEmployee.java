/***
   DailyEmployee implements the abstract class Employee
**/
public class DailyEmployee extends Employee{
   //define the attributes
   private double daily_rate,days_work;
   //create the constructors
   public DailyEmployee(){//default constructor
      super();
   }
   //user-defined constructor
   public DailyEmployee(String idno,String lastname,String firstname,int age,String position,double daily_rate,double days_work){
      super(idno,lastname,firstname,age,position);
      this.daily_rate=daily_rate;
      this.days_work=days_work;
   }
   //setters
   public void setDailyRate(double daily_rate)  { this.daily_rate=daily_rate; }
   public void setDaysWork(double days_work)    { this.days_work=days_work;   }
   //getters
   public double getDailyRate()                 { return daily_rate; }
   public double getDaysWork()                  { return days_work; }
   //create ann implementation of the inherited abstract method(REQUIRED), if not implemented this class becomes abstract
   public double computeSalary(){
      return daily_rate * days_work; 
   }
   //override the toString() method <--from the Object class
   public String toString(){
      return super.toString()+" "+daily_rate+" "+days_work+" "+computeSalary();
   }
}//end of class