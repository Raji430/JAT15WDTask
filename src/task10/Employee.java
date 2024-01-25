package task10;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private int salary;
	private String firstName, lastName;
	
	public int id(int id)
	{
		return id;
	}
	
	public int salary()
	{
		return salary;
	}
	
	public String firstName()
	{
		return firstName;
	}
	
	public String lastName()
	{
		return lastName;
	}
	
	public void raiseSalary(int percentage)
	{		
		int raisedSalary = salary + (salary*percentage)/100;
		System.out.println("Employee raised Salary is: " + raisedSalary);
		
	}
	
	public Employee()
	{		
		String name = firstName + lastName;			
		System.out.println("Employee Id is: " + id);
		System.out.println("Employee name is: " + name);		
	}
		
	public static void main(String[] args)
	{
		Employee obj = new Employee();	
		obj.id(1);
		obj.salary = 10000;
		obj.firstName = "Java";
		obj.lastName = "Course";
		System.out.println("Employee Salary is: " + obj.salary);
		obj.raiseSalary(10);
		
		
	}
}
