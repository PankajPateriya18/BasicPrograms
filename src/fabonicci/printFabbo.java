package fabonicci;

import java.util.Scanner;

public class printFabbo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		
		int range = sc.nextInt();
		
		int a=0, b=1, c;
		
		System.out.print("Fabonicci Series is : ");
		for(int i=1; i<=range; i++) {
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}
	}
}
