package task11;

import java.io.*;

public class Qu8Task11 {
	
	public static void fileExists() throws IOException	
	{
		 File newFile = new File("test.txt");
		   FileInputStream stream = new FileInputStream(newFile);
	}
	
	public static void main(String[] args)
	{
		try
		{
		fileExists();
		}
		catch(IOException e)
		{
			System.out.println("Exception Caught: No File found");
		}
	}

}
