package task11;

public class Qu5Task11 {
	
	public static void main(String[] args)
	{	
		//Array index out of bounds exception code
		
		System.out.println("Array Index out of exception output:");
		int arr[]= {1,2,3,4,5};
		try
		{
			for(int i =0; i<=arr.length; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception caught, Unable to print beyond the index" + "\n");
		}
		
		//String index out of bounds exception code
		System.out.println("String Index out of exception output:");
		String str = "Sample Test";
		try
		{
			//Trying to read and print character beyond the string array value 
			System.out.println(str.charAt(12));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception caught, Unable to read and print character beyond the string array value");
		}
		
	}

}
