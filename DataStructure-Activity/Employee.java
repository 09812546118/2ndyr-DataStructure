/***
   Employee Class
   - this class inherits from Person class
   - this class inherits all public,default, and protected properties from the Person class
**/
public abstract class Employee extends Person{
   //define the attributes
   private String idno,position;
   //create constructor
   public Employee() { 
      super(); //invoke the parent default constructor, this is required
   }
   public Employee(String idno,String lastname,String firstname,int age,String position){
      super(lastname,firstname,age);//invoke the parent user-defined constructor, this is required
      //property setter, this should only be defined after the super() statement
      this.idno=idno;
      this.position=position;
   }
   //create the setters
   public void setIdno(String idno)          { this.idno=idno; }
   public void setPosition(String position)  { this.position=position; }
   //create the getters
   public String getIdno()                   { return idno; }
   public String getPosition()               { return position; }
   //override the inherited toString()<-- from the Object class
   public String toString(){
      return idno+" "+super.toString()+" "+position;
   }
   //create the utility method computeSalary()
   public abstract double computeSalary(); //this will make the entire class abstract

}//end of class