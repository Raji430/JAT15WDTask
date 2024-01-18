package test;

public class Concrete extends Abs1{
	@Override
	public  void Inter3Method1()
	 {
		System.out.println("Inter3Method1");
		
	}
	
	@Override
	public void Inter3Method2() {
		System.out.println("Inter3Method2");
		
	}
	
	@Override
	public void Inter2Method1() {
		System.out.println("Inter2Method1");
		
	}

	@Override
	public void Inter2Method2() {
		System.out.println("Inter2Method2");
		
	}
	
	@Override
	public void Inter1Method1() {
		System.out.println("Inter1Method1");
		
	}

	@Override
	public void Inter1Method2() {
		System.out.println("Inter1Method2");
		
	}
	@Override
	public void sample() {
		System.out.println("Sample Method");
		}	
	
	
	public static void main (String[] args)
	{
		Concrete Obj  = new Concrete();
		Obj.Inter3Method1();
		Obj.Inter3Method2();
		Obj.Inter2Method1();
		Obj.Inter2Method2();
		Obj.Inter1Method1();
		Obj.Inter1Method2();
		Obj.sample();
	}



	}
