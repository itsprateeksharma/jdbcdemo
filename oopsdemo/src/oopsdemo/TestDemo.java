package oopsdemo;

import oopddemo3.Demo;

public class TestDemo {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		
		System.out.println("public variable of democlass another package: "+d1.a);
		d1.display();
	}

}
