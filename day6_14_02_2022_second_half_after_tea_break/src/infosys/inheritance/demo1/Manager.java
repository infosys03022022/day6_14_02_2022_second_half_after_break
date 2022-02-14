package infosys.inheritance.demo1;

public class Manager extends Employee {
  private int yearsOfExp;
  
  public Manager()
  {    //super();  // The control goes to the base class parameterless constructor
	  yearsOfExp=20;
	  System.out.println("I am the parameterless constructor of Manager class");
  }
  
  public void displayManager()
  {
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(yearsOfExp);
  }
}
