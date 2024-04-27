package conversions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Decimal Value : ");
		int num = sc.nextInt();
		int num2 = 0;
		int t=0, bin=0;
		if(num % 2 == 0) t=1;
		
		for(int i=num; i!=0; i=i/2) {
			num2 = (num2*10) + i % 2;		
		}
		
		for(int i = num2; i!=0; i=i/10) {
			bin = (bin*10) + i % 10;
		}
		if(t == 1) bin = bin * 10;
		System.out.println("Binary Number is : " + bin);
	}
}
