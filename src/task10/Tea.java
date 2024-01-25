package task10;

import java.util.Scanner;

public class Tea {
	
	public void prepareTea()
	{
		System.out.println("Prepare basic Tea with hot water and tea leaves");
	}
	
	public void addMilk()
	{
		System.out.println("Add milk to basic Tea");
	}
	public void addSugar()
	{
		System.out.println("Add sugar to basic Tea");
	}
	
	public static void main(String[] args)
	{
		Tea obj = new Tea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();
	}

}
