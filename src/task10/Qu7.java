package task10;

public class Qu7 extends Tea{
	
	public static void main(String[] args)
	{
		Tea objTea = new Tea();
		objTea.prepareTea();
		objTea.addMilk();
		objTea.addSugar();
		
		BlackTea objBlackTea = new BlackTea();
		objBlackTea.prepareTea();
		
		GreenTea objGreenTea = new GreenTea();
		objGreenTea.prepareTea();
		
		HerbalTea objHerbalTea = new HerbalTea();
		objHerbalTea.prepareTea();		
	}
}
