package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap<String,Double> hm= new HashMap<String,Double>();
		
		hm.put("John", 5000.50);
		hm.put("Jim", 4200.22);
		hm.put("Daisy", 4200.22);
		hm.put("Jack", 6700.50);
		hm.put("Mike", 10000.90);
		
		 System.out.println("Display customers: ");
		    for(String k:hm.keySet())
		    {
		    	System.out.println(k+ "-->"+hm.get(k));
		    }
		    
		    //deposit 1000 to jim's account
		    
		    double bal=hm.get("Jim");
		    hm.put("Jim", bal+1000);
		    System.out.println("Jim's updated balance: "+hm.get("Jim"));
		    
		    System.out.println(hm);
		    hm.putIfAbsent("Raj", 500.00);
		    System.out.println(hm);
		    Scanner s= new Scanner(System.in);
		    System.out.println("enter nam for balance: ");
		    String name=s.next();
		    System.out.println("The Balance of "+name+ " is :"+hm.get(name));
		    
		    
		    
		    

	}

}
