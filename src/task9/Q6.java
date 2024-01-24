package task9;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month in number");
		int month = s.nextInt();
		
		System.out.println("Enter room rent per day");
		double roomRent = s.nextInt();
		
		System.out.println("Enter no. of days stay in hotel");
		int days = s.nextInt();		
		
		switch(month)		
		{
		case 4,5,6,11,12:
		{
			// Calculation of 20% high during peak seasons
			/*double extraFare = ((roomRent * days)*20)/100;			
			roomRent = (roomRent*days) + extraFare;
			System.out.printf("Hotel Tariff to be paid= %.2f", roomRent ); */
			
		System.out.printf("Hotel Tariff to be paid= %.2f", (roomRent*days) + (((roomRent * days)*20)/100));
			
			break;
		}
		
		default:
			//roomRent = roomRent * days;
			System.out.printf("Hotel Tariff to be paid= %.2f", (roomRent * days));
			break;
	}
	}

}
