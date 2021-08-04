package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class PlayersList 
{
	//non generic ArrayList
	ArrayList playerArray;
	List subList;
		
	public PlayersList() 
	{
		playerArray = new ArrayList();
		subList = new ArrayList();
	}
	
	void addPlayer()
	{
		for (int i=1;i<=5;i++)
		{
			playerArray.add(i); //autoboxing
		}
		
		playerArray.add("Barun");
		playerArray.add("Abhi");
		playerArray.add("Catelyn");
		playerArray.add("Abhi");
		System.out.println();
			
	}

	void search() {
        System.out.println();
        System.out.println("************************************"
        + "***********************");
        System.out.println("Search for an object and return "
        + "the first and last position");
        System.out.println("*********************************"
        + "***************************");
        System.out.println();
        System.out.println("First occurance of the String"
        + " \"Abhi\" is at position " + playerArray.indexOf("Abhi"));
        System.out.println("Last occurance of the String"
        + " \"Abhi\" is at position  " + playerArray.lastIndexOf("Abhi"));
        System.out.println();
    }

	void extract() {
        System.out.println("***************************"
        + "*********************");
        System.out.println("Extract a sublist and "
        + "then print the new List ");
        System.out.println("************************"
        + "*************************");
        System.out.println();
        subList = playerArray.subList(5, playerArray.size());
        System.out.println("New Sub-List from index 5 to "
        + playerArray.size() + " is : " + subList);
        System.out.println();
    }



	public static void main(String[] args) 
	{
		PlayersList p1 =new PlayersList();
		p1.addPlayer();
		p1.search();
		p1.extract();
		
	}

}
