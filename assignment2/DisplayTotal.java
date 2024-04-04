package assignment2;

import java.util.Scanner;

public class DisplayTotal {
//1. using the scanner class accept two numbers from the user and display the total.
	public static void main(String[] args) {
		int num1, num2;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter 2 numbers....");
		num1 = sr.nextInt();
		num2 = sr.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		sr.close();

	}

}
