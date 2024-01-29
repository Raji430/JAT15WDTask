package task10;

public class Qu7 extends Tea{
	
	public static void main(String[] args)
	{
		Tea[] objT = new Tea[4];
		objT[0] = new Tea();
		objT[1] = new BlackTea();
		objT[2] = new GreenTea();
		objT[3] = new HerbalTea();
		
		
		objT[0].prepareTea();
		objT[1].prepareTea();
		objT[2].prepareTea();
		objT[3].prepareTea();
		
	}
}
