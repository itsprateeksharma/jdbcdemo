package oopsdemo;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Complex c1 =new Complex(10.3,67.4); // invokes constructor
		Complex c2 =new Complex(0.7,3.6);
		
		c1.add(c2); // calls method add() by passing obj
		
		System.out.println("addition of 2 complex no.s : ");
		c1.display();
		
		
		
	}

}
