package exceptionsdemo;

public class BankDemo {

	public static void main(String[] args) {
		
		CheckingAccount c1=new CheckingAccount(10001);
		System.out.println("Depositing $5000........");
		
		try
		{
			System.out.println("Withdrawing $1000");
			c1.withdraw(1000);
			
			System.out.println("Withdrawing $6000");
			c1.withdraw(6000);
		}
		catch(InSufficientFunds e)
		{
			System.out.println("Sorry insufficient balance:"+c1.getBalance());
			e.printStackTrace();
		}
		
		
	}

}
