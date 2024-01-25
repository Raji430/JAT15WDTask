package task10;

import java.util.Scanner;

public class Account {
	
	private double balance;
	
	public Account()
	{
		System.out.println("Construtor with no arguments");
	}
	
	public Account(int a, int b)
	{
		System.out.println("Construtor with two arguments");
	}
	
	public void withdraw(double debit)
	{		
		debit = balance - debit;
		System.out.println("Account balance after withdrawl: " + debit);
	}
	
	public void deposit(double credit)
	{
		credit = balance + credit;
		System.out.println("Account balance after deposit: " + credit);
	}
	
	public static void main(String[] args)
	{
		Account obj = new Account();
		double debit = 10000, credit = 2000;
		obj.balance = 25000;
		System.out.println("Initial Account balance is " +  obj.balance );
		
		obj.withdraw(debit);		
		
		obj.deposit(credit);	
		
	}

}
