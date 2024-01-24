package Day8;
import java.util.Scanner;

public class Ques10 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input number");
		
		int i = s.nextInt();
		int count = 0;
		while(i!=0)
		{
			i = i/10;
		++count;
		}
		System.out.println("Number of digits = " + count);
	}
	

}
