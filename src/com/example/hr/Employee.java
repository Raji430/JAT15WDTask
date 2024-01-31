package com.example.hr;

import java.util.Scanner;

public class Employee {
	
	public void printName(String name)
	{
		System.out.println("Employee Name: " + name);
	}

	public void printSalary(double salary)
	{
		System.out.println("Employee Salary: " + salary);
	}
	
	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    String name = null; double salary = 0; int id = 0;
    
    Employee obj = new Employee();
    obj.printName(name);
    obj.printSalary(salary);

	}

}
