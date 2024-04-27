package converting;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter year : ");

			int year = sc.nextInt();
			
			boolean f = false;
			
			if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ) f = true;
			
			System.out.println(f);
		}

	}
}
