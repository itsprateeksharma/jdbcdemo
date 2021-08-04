package newfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LambdaInMap {

	public static void main(String[] args) 
	{
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        //use lambda expression to traverse a map -java8
        books.forEach((key,value)-> System.out.println("Book Name :"+key +" -Author :"+value));
        
        for(Entry<String, String> e:books.entrySet()) //foe-in loop java 5
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
		
		

	}

}
