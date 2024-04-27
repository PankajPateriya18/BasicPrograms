package neon_number;

import java.util.Scanner;

public class PrintNeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		int i, j, sq;
		
		System.out.print("Neon Numbers are : ");
		for(i=0; i<=range; i++) {
			
			sq = i*i;
			
			int sum=0;
			
			while(sq != 0) {
				sum += sq%10;
				sq = sq/10;
			}
			
			if(sum == i)System.out.print(i + " ");
		}
		
	}
}
