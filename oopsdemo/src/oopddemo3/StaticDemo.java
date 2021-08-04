package oopddemo3;

class Count //instance class
{
	static int cnt; //static var
	int a;	//instance var
	
	Count()
	{
		cnt++;
		a=100;
	}
	
	static void display() //static method
	{
		System.out.println("No. of objects created : "+cnt);
	}
	void print() //instance method
	{
		System.out.println("instance method");
	} 
	
}



public class StaticDemo {

	public static void main(String[] args) {

		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();
		c2.print();
		//c3.print();
		c1.display();
		//Count.display(); //invoking static method
		
	}

}
