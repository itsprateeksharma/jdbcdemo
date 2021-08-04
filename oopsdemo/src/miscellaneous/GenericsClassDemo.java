package miscellaneous;

class Sample<T> //parametrized class /generic class
{
	private T data;   // generic variable declaration

	public Sample(T data) 
	{
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}

	public void setData(T data) 
	{
		this.data = data;
	}	
}

public class GenericsClassDemo 
{

	public static void main(String[] args) 
	{
		
		Sample<String> s1=new Sample<String>("Java Generics");  //object of generic class for type string
		System.out.println("display from generic class by passing string object: "+s1.getData());
		
		Sample<Integer> s2 =new Sample<Integer>(200);
		System.out.println("display from generic class by passing Integer object: "+s2.getData());
		
		Sample<Double> s3 =new Sample<Double>(555.543);
		System.out.println("display from generic class by passing Double object: "+s3.getData());
		
	}

}
