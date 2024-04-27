package strong_number;

import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		int num = sc.nextInt();
		int tNum = num;
		int sum = 0;
		int tSum;
		int f;
		
		for(int i=num; i != 0; i = i/10) {
			
			f = i % 10;
			
			tSum = 1;
			
			while(f != 0) {
				tSum = tSum * f--;
			}
			
			sum += tSum;
			
		}
		
		if(num == sum) System.out.println(tNum + " is a strong number");
		else System.out.println(tNum + " is not a strong number");
	}
}
