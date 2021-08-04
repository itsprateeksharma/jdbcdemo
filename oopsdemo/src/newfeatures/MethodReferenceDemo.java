package newfeatures;
interface  hello
{
	void welcome();
}

public class MethodReferenceDemo {
	
	public static void display()
	{
		System.out.println("hello from method reference");
	}
	
	public void print()
	{
		System.out.println("instance method call using method reference");
	}
	
	public MethodReferenceDemo() {
		System.out.println("in constructor");
	}

	public static void main(String[] args) 
	{
		hello h=MethodReferenceDemo::display; // invoke static method
		
		h.welcome();
		
		MethodReferenceDemo d1=new MethodReferenceDemo();
		hello h1=d1::print; //invoke instance method
		h1.welcome();

		hello h2= MethodReferenceDemo::new;
		h2.welcome();
	}

}
