/*Define a method which returns the sum of three numbers 
 * after rounding off each number to the next multiple of 10. 
 * If any of the given number is multiple of 10 dont change it's value
Write the method with the following specifications: 
Name of method: sumOfMultiples() // which accepts three integer 
value as argument and return the sum of three numbers after rounding 
off each number to the next multiple of 10. 
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 69
   30 + 40 + 70 = 140
If a = 23, b = 34, c = 50
   30 + 40 + 50 = 120
Specifications: The value returned by the method sumOfMultiples() 
is determined by the following rules:
If any of the given number is negative or zero, return -1.
If the number is an multiple of 10
If the given number is odd, return cube of the given number.*/

package others;

import java.util.Scanner;

public class SumOfRound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int f = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int s = sc.nextInt();
		System.out.print("Enter Third Number : ");
		int t = sc.nextInt();
		
		int r;
		r = f%10;
		if(r != 0) {
			f = f - r;
			f = f + 10;
		}
		r = s%10;
		if(r != 0) {
			s = s - r;
			s = s + 10;
		}
		r = t%10;
		if(r != 0) {
			t = t - r;
			t = t + 10;
		}
		System.out.println(f + " + " + s + " + " + " + " + t + " = " + (f+s+t));
		
	}
}
