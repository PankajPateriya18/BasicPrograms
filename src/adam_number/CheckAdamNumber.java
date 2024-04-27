/*Write a program to check the given number is and adam number are not.
Explanation:
If a number when reversed, the square of the number and the square 
of the reversed number should be number which are reverse to each other, is Adam number.
Example: 
Input: 12
12 ^ 2 = 144
21 ^ 2 = 441
The reverse of 144 is equal to 441 and reverse of 441 is equal to 
144 so., 12 is an Adam number.
11, 12, 13, 21, 22, 31, 101, 102, 103, 111, 112, 113, 121 ... are 
Adam numbers.
Write the methods with the following specifications: 
Name of method isAdamNumber() // which accepts an integer as argument 
and return true if it is an adam number else return false.
Arguments: One argument an integer value
Return Type: an boolean value

Example:
Input: 121
Output: true
Input: 17
Output: false
Name of method getReverse() // which accepts an Integer value as 
argument and return the reverse of it.
Arguments: One argument of integer value
Return Type: an integer value
Example:
Input: 421
Output: 124
Input: 134
Output: 431
Name of method getSquare() // which accepts an Integer value as 
argument and square of the number
*/
package adam_number;

import java.util.Scanner;

public class CheckAdamNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int f = sc.nextInt();
		int s = 0, t=f, r, r1, i;
		while(t != 0) {
			r = t % 10;
			s = (s*10) + r;
			t = t/10;
		}
		int fs, ss, fr;
		fs = f * f;
		ss = s * s;
		fr=0;
		for(i=fs; i != 0; i=i/10) {
			fr = (fr*10) + i%10;
		}
		if(fr == ss) System.out.println(f + " is adam number of " + s);
		else System.out.println(f + " is not a adam number");
	}
}
