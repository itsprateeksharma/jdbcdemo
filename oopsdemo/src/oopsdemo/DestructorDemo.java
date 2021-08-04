package oopsdemo;

class Test{
	
	public void finalize()
	{
		System.out.println("Object destroyed and Garbage collected");
	}
}
	public class DestructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(); //initialize obj-- call default
		Test t2=new Test();
			
		t1=null; // dealocate memory
		t2=null;
		
		System.gc();//invoke service method gc() ==> invoke finalize()
		
		System.out.println("In main Method");
		
		
	}

}
