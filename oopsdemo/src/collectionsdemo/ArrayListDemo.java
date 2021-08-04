package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//generic 
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arraylist
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("c# 5.0");
		
		System.out.println(a1);
		
		System.out.println("element at index 2 is: "+a1.get(2));
		System.out.println("does contains java? : "+a1.contains("Java"));
		
		//add elements at specific index
		
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("is ArrayList empty? : "+a1.isEmpty());
		System.out.println("INdex of Perl : "+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList : "+a1.size());
		
		Collections.sort(a1);
		System.out.println("ArrayList after sorting : "+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		
		System.out.println(a2);
		System.out.println("size : "+a2.size());
		
		
		
		
	}

}
