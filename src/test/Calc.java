package test;

public class Calc {
	
	int n1 = 30;
	int n2 = 20;
	int n3;
	
	public void add()
	{
		n3 = n1 + n2;
		
		System.out.println("The Addition Value is: " + n3);
		
	}
	
	public int sub()
	{
		n3 = n1 - n2;
		return n3;
		
	
	}
	
	public static int multiply()
	{
		int n1 = 2;
		int n2 = 3;
		int n3;
	
		return  n3 = n1*n2;
		
	}
	
	public static void main(String[] args)
	{
		Calc O1 = new Calc();
		
			
		O1.add();
		//O1.sub();
		System.out.println("The Subtraction Value is: " + O1.sub());
		
		System.out.println("The Multiplication Value is: " + multiply());
			
		
	}

}
