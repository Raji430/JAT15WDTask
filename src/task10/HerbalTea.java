package task10;

public class HerbalTea extends Tea{
	
	public void prepareTea()
	{
		System.out.println("Herbal Tea");
	}
	
	public static void main(String[] args)
	{
		HerbalTea objHerbal = new HerbalTea();
		objHerbal.prepareTea();
	}

}
