package assignment2_1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		int b = number / 10;
		int e = number % 10;

		double result = Math.pow(b, e);
		System.out.println("Result: " + b + " raised to the power of " + e + " is " + result);

		scanner.close();
	}

}
