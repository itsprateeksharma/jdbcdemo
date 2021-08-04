package oopddemo3;

class Test
{
	int a;//default variable
	private int b; // pri. var
	protected int c; // accessed in subclass
	public int d;
	
	public Test(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		d=500;
	}

	public void display()//public method
	{
		System.out.println("privt. var : "+b);
	}
	
}


class Test2 extends Test
{

	public Test2(int a, int b, int c) 
	{
		super(a, b, c);
	}
	
	public void display()//public method
	{
		System.out.println("protected var : "+c);
	}
	
}


public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(100,200,300);
		t1.display();
		//t1.b=50; compiler error can't access private variable
		System.out.println("default variable : "+t1.a);
	}

}
