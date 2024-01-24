package task9;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the mark scored by student");
		int grade = s.nextInt();
		
		if(grade == 100)
		{
			System.out.println("S");
		}
		else if(grade >=90 & grade <100)
		{
			System.out.println("A");
		}
			
		else if(grade >=80 & grade <90)
		{
			System.out.println("B");
		}
		else if(grade >=70 & grade <80)
		{
			System.out.println("C");
		}
		else if(grade >=60 & grade <70)
		{
			System.out.println("D");
		}
		else if(grade >=50 & grade <60)
		{
			System.out.println("E");
		}
		else if(grade <50)
		{
			System.out.println("F");
		}
		else if (grade >100)
		{
			System.out.println("Invalid Input");
		}
		}
		
	}


