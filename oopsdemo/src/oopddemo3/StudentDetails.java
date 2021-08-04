package oopddemo3;


	//multiple Interface implementation
public class StudentDetails implements CollegeData, HostelData {

	College c1=new College("CARDI B", 901, "WAP", "Money");
	Hostel h1=new Hostel("justin", "canada");
	
	
	@Override
	public void hostelDetail() 
	{
	System.out.println("---------------hostel details------------------");
	System.out.println("Hostel name: "+h1.getName());
	System.out.println("Location: " +h1.getLocation());
	}

	@Override
	public void studentRecord() 
	{
		System.out.println("Students selcted based on percentage and finance");

	}

	@Override
	public void collegeDetail() 
	{
		System.out.println("---------------College details------------------");
		System.out.println("College name: "+c1.getName());
		System.out.println("college id: "+c1.getId());
		//System.out.println("course: "+c1.getCourse());
		System.out.println("university: "+c1.getUniversity());

	}

	@Override
	public void studentData() 
	{
		System.out.println("students can join courses : MCA,MTECH,BCA,BTECH");

	}

	public static void main(String[] args) 
	{
		StudentDetails ss=new StudentDetails();
		ss.collegeDetail();
		ss.studentData();
		ss.hostelDetail();
		ss.studentRecord();

	}

}
