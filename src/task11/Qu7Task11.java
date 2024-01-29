package task11;

import java.util.Scanner;

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException ()  
    {  
        // calling the constructor of parent Exception  
        super();  
    }  
}  

public class Qu7Task11 {
	
	public static void ageValid(int age) throws InvalidAgeException
	{
		if (age >= 18)
		{
			System.out.println("Valid Age");
		}
		else
		{
			throw new InvalidAgeException();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		
		try
		{
			ageValid(age);
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("Exception Caught: Invalid Age");
		}
	}
}
