package exceptionsdemo;

public class ThrowExample {
	
	public static void checkEligibility(int age,int weight)
	{
		if(age<12 && weight<40)
			throw new ArithmeticException("Student is not Eligible for registration.");
			else
			{
				System.out.println("student with age:"+age+" and "+weight+ " are eligible");
			}
	
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Sports Eligibility Process..");
		checkEligibility(20, 45);
		System.out.println("Thank you!");
		checkEligibility(10,39);

	}

}
