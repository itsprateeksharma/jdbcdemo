package miscellaneous;

public class WrapperDemo {

	public static void main(String[] args) {

		//create primitive types
		int a=5;
		float b=10.10f;
		
		//convert into wrapper obj	
	//	Integer aObj=new Integer(a);
	//	Double bObj=new Double(b);
		
		Integer aObj=a; //autoboxing- convert value to obj type
		Float bObj=b;
		//create wrapper class objts
		Integer x=Integer.valueOf(100);
		Double y=Double.valueOf(20000.00);
		
		//convert to primitive types
		
		int p=x.intValue(); //unboxing - converting obj to value type
		double q=y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aObj+" "+bObj);
		
		char e='a';
		Character objE=e; // boxing 
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
		
		
		Double d= 200.5;
		Double objD= Double.valueOf(d);
		System.out.println(d);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
		
		
		
		
	}

}
