package oopddemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {

		Developer d1=new Developer(101, "james chad", "jdbc");
		Developer d2=new Developer(102, "scarlett john", "Spring");
				d1.display(); // child class obj inv parent class method
				d1.display1(); // child class obj invoke child class method
	
				d2.display();
				d2.display1();
		Accountant a1=new Accountant(201, "Ryan Gosling", "Process Salary", "Sap");
		Accountant a2=new Accountant(202, "Hailey Coup", "Payment to vendors", "tally");
	   //invoke accountant class methods
				a1.display();
				a2.display();
	
	
	}

}
