package newfeatures;

@FunctionalInterface
interface MyFunctionalInterface
{
	public String sayHello();
}

@FunctionalInterface
interface MyFunctionalInterface1
{
	public int incrementbyFive(int a);
}

interface StringConcat
{
	public String sconcat(String a,String b);
}


public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		//lambda expression with no parameter
		MyFunctionalInterface msg=()->{return "Hello from lambda expressions";};
		System.out.println(msg.sayHello());

		//lambda expression with single parameter
		MyFunctionalInterface1 f=(num) ->num+5;
		System.out.println(f.incrementbyFive(20));
		
		////lambda expression with multiple parameter
		
		StringConcat s=(str1,str2)-> str1+str2;
		System.out.println("String concat using lambda expr.: ");
		System.out.println(s.sconcat("Hello", " JAVA 8"));
		
		
		
	}

}
