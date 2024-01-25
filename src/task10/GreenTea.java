package task10;

public class GreenTea extends Tea{
	
	public void prepareTea()	
	{
		System.out.println("Prepare Green Tea");
	}
	public static void main(String[] args)
	{
		GreenTea objGreen = new GreenTea();
		objGreen.prepareTea();
	}

}
