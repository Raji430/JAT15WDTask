package task10;

import java.util.Scanner;

public class Person {
	
	private int age;
	private String name;
	
	public int age()
	{
		return age;
	}
	
	public String name()
	{
		return name;
	}
	
	public Person()	
	{
		age = 30;
		name = "Java Test";
	}
	
	public static void main(String[] args)
	{
		Person obj = new Person();
		
		System.out.println("Age is: " + obj.age);
		System.out.println("Name is: " + obj.name);
		
	}

}
