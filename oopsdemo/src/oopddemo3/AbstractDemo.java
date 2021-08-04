package oopddemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Trainee t1=new Marks("Kendall","California",67789800,40);//upcasting
		
		t1.show(); // invoke abstract base class method
		double marks=t1.calculateMarks(); //invoke sub class method
		System.out.println(t1+" "+marks ); //to string method invoke
		//t1.calculateMarks(); ? how is to string invoked
		

}
}
