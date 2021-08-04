package oopddemo2;

class Staff
{
	private int empId;
	private String name;
	protected float salary,hra;
	
	public Staff(int empId, String name, float salary) 
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRA : "+hra);
		
	}	
	
	void display()
	{
		//System.out.println("-------Employee Details-------- ");
		System.out.println(empId+ " "+name+ " " +salary);
		
	}
}

class Manager extends Staff
{	
	protected float da;
	private float gross;

	public Manager(int empId, String name, float salary) 
	{
		super(empId, name, salary);

	}
	
	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is : "+da);
	}
	
	void getGross()
	{
		gross= salary+hra+da;
		System.out.println("Gross salary of Manager is: "+gross);
	}
	
}


class Director extends Manager
{
		private float ta,gross;
		
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}
	
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is : "+ta);
		
	}
	void getGross()
	{
		gross= salary+hra+da+ta;
		System.out.println("Gross salary of Director is: "+gross);
	}
}


public class Multilevel2 {

	public static void main(String[] args) 
	{
		Director d1=new Director(101,"JOHANSAN", 5000);
		System.out.println("*******Director Details********");
		d1.display();// staff method
		d1.getHRA(); //staff method
		d1.getDA(); //manager method
		d1.getTA(); // director
		d1.getGross(); // director
		
		Manager m1 =new Manager(201, "Stevie", 4000);
		System.out.println();
		System.out.println("*******Manager Details********");
		m1.display();
		m1.getHRA();
		m1.getDA();
		m1.getGross();
		
		Staff s1=new Staff(301,"helene",3000);
		System.out.println();
		System.out.println("*******Staff Details********");
		s1.display();
		s1.getHRA();

	}

}
