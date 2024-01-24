package task9;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {			
		
		int i, j, k, n = 5;  
		//Scanner sc = new Scanner(System.in);  
		//System.out.print("Enter the input");  
		//n = sc.nextInt();              
		for (i= 0; i<= n-1 ; i++)  
		{  
			for (k=n-2; k<=n-1; k++)   
		{   
				if (i==0 || i==4)
				{
				System.out.print("*" + "   ");   
		}   
				if (i==1 || i==3)
				{
				System.out.print(" *"); 
				
		}   
				if(i==2)
				{
					System.out.print("  " + "*");
					break;
				}				
		}
			System.out.println(" ");   
		}
		}  
		}  
	
