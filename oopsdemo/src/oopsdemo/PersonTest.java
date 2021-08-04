package oopsdemo;

import java.util.Scanner;

// prgrm to demonstrate working of constructors
class Person
{
	String name, constituency;
	int age;
	Scanner s;
	
	public Person() 
	{
		System.out.println("voter eligibility app");
		age=0;
		name="";
		constituency="Delhi";
		s=new Scanner(System.in);
	}

	public Person(String name, int age) // parametrized const.
	{
		this.name = name;
		this.age = age;
		constituency="Pune";
	}

	Person(String n, int a ,String c)
	{
		name=n;
		age= a;
		constituency=c;
	}
	
	
	void input() 
	{
		System.out.println("enter name: ");
		name=s.nextLine();
		System.out.println("enter age: ");
		age=s.nextInt();
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("constituency: "+constituency);
	}
	
	
}


public class PersonTest {

	public static void main(String[] args) {

		Person objP1 =new Person();
		objP1.input();
		objP1.print();
		System.out.println("--------------------------");
		Person objP2 =new Person("Kamal",34);
		objP2.print();
		
		System.out.println("--------------------------");
		Person objP3 =new Person("Ravi",40,"bengaluru");
		objP3.print();
	}

}
