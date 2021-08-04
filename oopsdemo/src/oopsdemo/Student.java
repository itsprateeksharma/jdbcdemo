package oopsdemo;

import java.util.Scanner;

public class Student {

	//oinstance class
	int rollNumber;
	String name, course;
	float m1,m2,m3,total;
	Scanner sc =new Scanner(System.in);
	//methods
	
	void input() {
		
		System.out.println("enter roll no., name and course:");
		rollNumber= sc.nextInt();
		name=sc.next();
		course =sc.next();
		
		System.out.println("enter marks of three subjects : ");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
	}
	float calculate()
	{
		total= m1+m2+m3;
		return total;
		
	}
	void display() 
	{
		System.out.println("--------STUDENT DETAILS-----------");
		System.out.println("Roll no.: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("course: "+course);
		System.out.println("Total marks: "+total);
		System.out.println("----------------------------------");
		
		
		
		
	}
}
