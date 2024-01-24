package task9;

import java.util.*; 

public class Q1 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String rev = "";
		
		System.out.println("Enter the String");
		
		String str = s.nextLine();
		int strLength = str.length();
		
		for (int i=strLength-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not palindrome");
		}
	}
}
