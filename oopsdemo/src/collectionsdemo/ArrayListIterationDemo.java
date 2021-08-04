package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		
		names.add("James");
		names.add("Michael");
		names.add("Andy");
		names.add("Jim");
		names.add("Robert");
		
		System.out.println(names);
		
		//iterator interface fir traversing
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(names.get(1));
		names.add(3,"Kimberly"); //adding at specific index
		names.remove(0); //delete first element
		names.set(1, "Java"); //replaces existing element
		
		System.out.println("display collection using for each loop: ");
		
		for(String i: names)
		{
			System.out.println(i);
		}
			ArrayList<Double> marks=new ArrayList<Double>();
					marks.add(999.0);
					marks.add(677.908);
					marks.add(789.9);
					marks.add(871.90);
					marks.add(450.45);
					
					System.out.println();
					
					for(Double i:marks)
					{
						System.out.println(i);
					}
					
					
	}

}
