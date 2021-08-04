package oopddemo2;

class Bank{
	
	int getrateofinterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to Bank");
	}
}

class SBI extends Bank
{
	int getrateofinterest()
	{
		return 0;
	}
	
}

class ICICI extends Bank
{
	int getrateofinterest()
	{
		return 7;
	}
}

class Axis extends Bank
{
	int getrateofinterest()
	{
		return 6;
	}

}

public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		Axis b3= new Axis();
	
		b1.display();
		System.out.println("the ROI at SBI is: "+b1.getrateofinterest());
		b2.display();
		System.out.println("the ROI at ICICI is: "+b2.getrateofinterest());
		b3.display();
		System.out.println("the ROI at Axis is: "+b3.getrateofinterest());
		
	}

}
