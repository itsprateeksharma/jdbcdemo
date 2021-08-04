package oopddemo3;

public class ObjectClass {

	public static void main(String[] args) {
		
		
		ObjectClass oc= new ObjectClass();
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
		
		System.out.println(oc.getClass());
		
		ObjectClass oc1=new ObjectClass();
		System.out.println(oc.equals(oc1));
		System.out.println(oc1.hashCode());
		System.out.println(oc.toString());
		
		ObjectClass oc2 = oc;
		System.out.println(oc.equals(oc2));
		
		Student s1=new Student(101,"Prateek");
		Student s2=new Student(101,"Prateek");
				System.out.println(s1.getClass());
				s1=s2;
		System.out.println(s1.equals(s2));
		//System.out.println(s1==s2);
		String s="java";
		String t="java";
		String k=new String("java");
		
		System.out.println(s.equals(t));
		System.out.println(s.equals(k));
		System.out.println(s==k);
		System.out.println(s==t);
		
	}

}
