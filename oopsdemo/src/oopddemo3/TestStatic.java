package oopddemo3;

public class TestStatic {

	public static void main(String[] args) {
		
		Student.collegeChange();
		
		Student s1= new Student(1231, "jordan");
		Student s2= new Student(1232, "kelly");
		Student s3= new Student(1233, "leslie");
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}

}
