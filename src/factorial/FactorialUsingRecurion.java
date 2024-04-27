package factorial;

import java.util.Scanner;

class Logic{
	
	static int factorial(int n) {
		if(n == 1) return 1;
		else {
			return n * factorial(n-1);
		}
	}
}

public class FactorialUsingRecurion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Digit : ");
		int n = sc.nextInt();
		
		int fact = Logic.factorial(n);
		
		System.out.println(fact);
		
		sc.close();
	}
}
