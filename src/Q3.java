package task9;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input number");
		int rows = s.nextInt();   
		int i,j, num =1;
		
		System.out.println("Sample Output");
		for(i=0; i<rows; i++)   
		{		
		for(j=0; j<=i; j++)   
		{  
		System.out.print(num + " "); 
		num++;
		}
		System.out.println();   
		}   
	}

}
