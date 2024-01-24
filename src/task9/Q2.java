package task9;
import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the input string");
		
		String str = s.nextLine();
		String rev = "";
		int strLength = str.length();
		
		for (int i= strLength-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("String reverse is: " + rev);
	}

}
