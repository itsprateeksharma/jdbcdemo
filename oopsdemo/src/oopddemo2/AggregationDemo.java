package oopddemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address("Faridabad", "Haryana", "India", 121001);
		Address ad2 =new Address("NewYork","la","US",101001);
		
		Student s1=new Student(19619, "Prateek", ad1);
		s1.display();
		
		Student s2=new Student(12873, "Carlos", ad2);
		s2.display();
		
		
		
		
	}

}
