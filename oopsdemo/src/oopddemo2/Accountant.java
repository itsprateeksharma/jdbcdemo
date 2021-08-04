package oopddemo2;

public class Accountant extends Employee //child class derived from parent
{
	
	
	String task,tech;

	public Accountant(int empId, String name,String t, String t2) {
		super(empId, name); //invoke base class contructor
		this.task=t;
		this.tech=t2;
		
	}
	
	void display()
	{
		super.display(); // invokes base class display() method
		System.out.println("Accountant task : "+task);
		System.out.println("Softwares used: "+tech);
	}
	
	
	
	

}
