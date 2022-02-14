package infosys.inheritance.demo2;

public class Employee {
  
	  private int id;
	  private String name;
	  
	  public Employee() {
		  id=1;
		  name="Ashok";
		  System.out.println("I am the parameterless construtor of Employee class");
	  }
	  
	 public void displayEmployee()
	  {
		  System.out.println(id);
		  System.out.println(name);
	  } 
	
}
