package armstrong_number;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		int j, p=0, r, sum=0, i, tSum;
		
		for(i=n; i!=0; i=i/10) {
			p++;
		}
		
		for(i=n; i!=0; i=i/10) {
			r = i%10;
			tSum=1;
			for(j=1; j<=p; j++) {
				tSum = tSum * r;
			}
			sum += tSum;
		}
		
		if(n == sum) System.out.println(n + " is an Armstrong Number");
		else System.out.println(n + " is not an Armstrong Number");
	    
		sc.close();
	}
}
