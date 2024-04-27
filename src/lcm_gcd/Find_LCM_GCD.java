package lcm_gcd;

import java.util.Scanner;

public class Find_LCM_GCD {
	
	int findLCM(int a, int b) {
		int lcm;
		if(a > b) lcm = a;
		else lcm = b;
		for(int i=lcm; ; i++) {
			if(i % a == 0 && i % b == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}
	
	int findGCD(int a, int b) {
		int gcd = 1;
		
		for(int i=1; i<a && i <b; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd=i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Number : ");
		int f = sc.nextInt();
		
		System.out.print("Second Number : ");
		int s = sc.nextInt();
		
		Find_LCM_GCD fi = new Find_LCM_GCD();
		System.out.println("LCM is : " + fi.findLCM(f, s));
		System.out.println("GCD is : " + fi.findGCD(f, s));
		
	}
}
