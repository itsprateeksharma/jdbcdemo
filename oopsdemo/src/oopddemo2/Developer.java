package oopddemo2;

public class Developer extends Employee {

	String technology;
	
	public Developer(int empId, String name, String tech) {
		super(empId, name); //invoke base class constr.
		this.technology=tech;

	
	}
	void display1() {
		
		System.out.println("Technology used: "+technology);
	}
	
	
	
	
	

}
