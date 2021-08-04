package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	public void square(int a); //abstract method

	//default method
	default void display(String a)
	{
		System.out.println("Hello "+a);
	}
	
	//static method
	static void printDate()
	{
		System.out.println("Today's Date: "+LocalDate.now());
	}
	
}

public class DefaultMethodDemo implements MyInterface {

	public static void main(String[] args) 
	{
		DefaultMethodDemo d1=new DefaultMethodDemo();
		d1.square(5);
		
		//call default method
		d1.display("Default Method");
		
		//call static method in interface
		MyInterface.printDate();
	}

	@Override
	public void square(int a) {

		System.out.println("Square of number is :"+(a*a));
	}

}
