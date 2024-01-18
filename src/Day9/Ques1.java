package Day9;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
 System.out.println("Enter Value of 'a'");
 int a = s.nextInt();
 
 System.out.println("Enter Value of 'b'");
 int b = s.nextInt();
 
 System.out.println("Enter Value of 'c'");
 int c = s.nextInt();
 
 System.out.println("Enter Value of 'd'");
 int d = s.nextInt();
 
 if( (a+b) > (c+d))
 {
	 System.out.println("Sum of a and b is greater than sum of c and d");
 }
	
	else
	{
		System.out.println("Sum of and b is not greater than sum of c and d");
	}
}
}
