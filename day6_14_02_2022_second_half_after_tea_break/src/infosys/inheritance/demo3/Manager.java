package infosys.inheritance.demo3;

public class Manager extends Employee{
   private int yearsOfExp;
   
   public Manager(int id, String name, int yearsOfExp)
   {
	   super(id,name); // It is invoking the base class parameterized constructor
       this.yearsOfExp=yearsOfExp;
   }
   
   public void displayDetails()
   {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(yearsOfExp);
   }
   
}
