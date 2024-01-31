package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee empObj = new Employee();
		
		String name = "Jessy"; double salary = 50000; int id = 1;
		
		empObj.printName(name);
		empObj.printSalary(salary);
		
	}
}
