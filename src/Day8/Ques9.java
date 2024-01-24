package Day8;
import java.util.Scanner;

public class Ques9 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		if(age >= 60)
		{
			System.out.println("Person is Senior Citizen");
			
		}
		else
		{
			System.out.println("Person is not Senior Citizen");
		}
	}

}
