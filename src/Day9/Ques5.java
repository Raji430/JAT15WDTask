package Day9;

import java.util.Scanner;

public class Ques5
{
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = s.nextInt();
		
		 int b,c=0,flag=0;      
		     
		  c=a/2;      
		  if(a==0||a==1)
		  {  
		   System.out.println("Entered number is not prime number");      
		  }
		  else
		  {  
		   for(b=2;b<=c;b++)
		   {      
		    if(a%b==0)
		    {      
		     System.out.println("Given input number is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0) 
		   { 
			   System.out.println("Input number is prime number");
		   }  
		  } 
		}  
		
	}
