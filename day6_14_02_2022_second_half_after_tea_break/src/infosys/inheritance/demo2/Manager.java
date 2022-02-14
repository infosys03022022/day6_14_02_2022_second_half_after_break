package infosys.inheritance.demo2;

public class Manager extends Employee {
  private int yearsOfExp;
  
  public Manager()
  {    //super();  // The control goes to the base class parameterless constructor
	  yearsOfExp=20;
	  System.out.println("I am the parameterless constructor of Manager class");
  }
  
  public void displayManager()
  {
	  // private member of the base class is not accessible in 
	  // the derived class
	 // System.out.println(id);
	 // System.out.println(name);
	  System.out.println(yearsOfExp);
  }
}
