package task11;
import java.util.Scanner;

public class Qu6Task11 {
	
	//Actual Password
	static String actualPwd = "Password@123";
	
	//Method to validate the password 
	public static void passwordCheck(String pwd) throws Exception
	{
		if(actualPwd.equals(pwd))
		{
			System.out.println("Login credentials matches");
		}
		else
		{
			throw new Exception();
		}
	}
	public static void main(String[] args)
	{		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password");
				
		String expectedPwd = s.next();
		
		try
		{
			//calling the method to validate the password
			passwordCheck(expectedPwd);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught: Invalid Password");
		}
		
		
	}

}
