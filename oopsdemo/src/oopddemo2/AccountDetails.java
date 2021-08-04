package oopddemo2;
 /* multi level inher.
  * account--->savingsbank--->accountdetails
  */
public class AccountDetails extends SavingsBank //child class of savings bank

{
	
	int withdrawl,deposit , finalBalance;
	

	public AccountDetails(int accNo, String name, int mb, int b,int w,int dep) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=dep;

	
	}
	void display()
	{
		super.display();
		System.out.println("Deposit: "+deposit);
		System.out.println("withdrawls: "+withdrawl);
		finalBalance= (balance+ deposit) - withdrawl;
		
		System.out.println("Final balance: "+finalBalance);
	}
	

}
