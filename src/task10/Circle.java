package task10;

import java.util.Scanner;

public class Circle {
	
	private int radius;
	
	public Circle()
	{
		System.out.println("Construtor with no arguments");
	}
	
	public Circle(int radius, int diameter)
	{
		System.out.println("Construtor with two arguments");		
	}
	public void circumference()
	{
		double cf = 2*3.14*radius;
		System.out.println("circumference of a circle is: " + cf);
	}
	public static void main(String[] args)
	{
		Circle obj = new Circle();		
		obj.radius = 10;
		obj.circumference();
	}

}
