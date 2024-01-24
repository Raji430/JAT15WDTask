package Day8;

import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Input Number");
		int num = s.nextInt();
		if(num %2 == 0)
		{
			System.out.println("Given Input Number " + num + " is an even number");
		}
		
	}

}
