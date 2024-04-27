package others;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		
		int num = sc.nextInt();
		
		int f=1;
		
		for(int i=num; i>=1; i--) {
			
			f = f * i;
		}
		
		System.out.println(num + " Factorial is : " + f);
	}
}
