package converting;

import java.util.Scanner;

public class YearIntoDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter years : ");
		int year = sc.nextInt();
		
		System.out.print("Enter Months : ");
		int months = sc.nextInt();
		
		System.out.print("Enter days : ");
		int days = sc.nextInt();
		
		
		int totalDays = (365 * year) + (months * 30) + days;
		
		System.out.println("Total Number of days are : " + totalDays);

	}

}
