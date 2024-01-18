package Day9;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Value 'A'");
		int A = s.nextInt();
		
		System.out.println("Enter Value 'B'");
		int B = s.nextInt();
		
		int C = B;
		
		B = A;
		A = C;
		
		System.out.println("Swapped numbers");
		System.out.println("Value of A = " + A );
		System.out.println("Value of B = "+ B);
	}
}
