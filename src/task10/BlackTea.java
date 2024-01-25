package task10;

public class BlackTea extends Tea {
	
	public void prepareTea()
	{
		System.out.println("Prepare Black Tea");
	}
	
	public static void main(String[] args)
	{
		BlackTea objBlack = new BlackTea();
		objBlack.prepareTea();
		
	}

}
