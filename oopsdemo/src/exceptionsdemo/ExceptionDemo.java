package exceptionsdemo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a, b, result; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Input two integers"); 
		a = input.nextInt(); 
		b = input.nextInt();
		
		try
		{
			result = a / b;  
			System.out.println("Result = " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by ZERO error");
			System.out.println("exception: "+e.getMessage());
			System.out.println("exception name+description: "+e.toString());
			e.printStackTrace();//details abt exception name,descr.,line no. of code which generated exc
		}
		
		finally
		{
			input.close();
			System.out.println("program ended");
		}
		
		

	}

}
