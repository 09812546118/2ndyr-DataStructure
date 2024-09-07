/***
   Person Class
   ------------------------
**/
public class Person{
   //define the attributes
   private String lastname,firstname;
   private int age;
   //create the class constructors
   public Person(){} //default constructor
   public Person(String lastname,String firstname,int age){//user-defined constructor
      this.lastname=lastname;
      this.firstname=firstname;
      this.age=age;
   } 
   //create the setters -methods used to alter the content of the attributes
   public void setLastname(String lastname)     { this.lastname=lastname; }
   public void setFirstname(String firstname)   { this.firstname=firstname; }
   public void setAge(int age)                  { this.age=age; }
   //create the getters - methods used to retrieve the content of the attribute
   public String getLastname()                  { return lastname; }
   public String getFirstname()                 { return firstname; }
   public int getAge()                          { return age; }
   //override - replace the method from the parent class(Object)
   public String toString(){
      return lastname+" "+firstname+" "+age;
   }
}//end of class