package oopddemo2;
// hierarchical inheritance
class Doctor
{
	
	int idNumber;
	String name;
	String address;
	
	public Doctor(int idNumber, String name, String address) 
	{
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	
	void display() 
	    {
	    System.out.println("********* Doctor Details ***********");
	        System.out.println("The name is :" + name);
	        System.out.println("The number is :" + idNumber);
	        System.out.println("The address is :" + address);
	    }	
}
	class Specialist extends Doctor
	{
		String speciality;
		public Specialist(int idNumber, String name, String address,String sp) 
		{
			super(idNumber, name, address);
			// base class constructor invoke
			
			this.speciality=sp;	
			
		}	
		void display()
		{ 
			super.display(); //call base class 
			System.out.println("the speciality is: " +speciality);
		}
		
	}
	
	class NonSpecialist extends Doctor
	{
		public NonSpecialist(int idNumber, String name, String address) 
		{
			super(idNumber, name, address);
			// invoking base class constructor 					
		}
	}



public class TestDoctor 
{
	public static void main(String[] args) 
	{
		// invoke child class specialist constructor
		
		Specialist spObj= new Specialist(1001, "Dr.mary jane", "34-c,new york", "physician");
		spObj.display(); //
		
		NonSpecialist nspObj =new NonSpecialist(1005, "jp cooper", "wall-estreet florida");
		nspObj.display();
		
		
	}

}
