package findArea;

import java.util.Scanner;

class Logic {

	double squareArea(float side) {
		double area = side * side;
		return area;
	}

	double rectangleArea(float length, float breath) {
		double area = length * breath;
		return area;
	}

	double triangleArea(float height, float base) {
		double area = 0.5 * height * base;
		return area;
	}

	double circleArea(float radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}

public class FindArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Logic l = new Logic();
		float side, length, breath, height, base, radius;
		double area;
		do {
			System.out.println("\n-----------------------------------------------");
			System.out.println("\nChoose option to find Area");
			System.out.println("\t1. Square");
			System.out.println("\t2. Rectangle");
			System.out.println("\t3. Triangle");
			System.out.println("\t4. Circle");
			System.out.print("Enter option : ");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.print("Enter side : ");
				side = sc.nextFloat();
				area = l.squareArea(side);
				System.out.println("Square Area is : " + area);
				break;
			case 2:
				System.out.print("Enter Lenght : ");
				length = sc.nextFloat();
				System.out.print("Enter Breath : ");
				breath = sc.nextFloat();
				area = l.rectangleArea(length, breath);
				System.out.println("Rectangle Area is : " + area);
				break;
			case 3:
				System.out.print("Enter Height : ");
				height = sc.nextFloat();
				System.out.print("Enter Base : ");
				base = sc.nextFloat();
				area = l.triangleArea(height, base);
				System.out.println("Triangle Area is : " + area);
				break;
			case 4:
				System.out.print("Enter Radius : ");
				radius = sc.nextFloat();
				area = l.circleArea(radius);
				System.out.println("Circle Area is : " + area);
				break;
			}
		} while (true);
	}
}
