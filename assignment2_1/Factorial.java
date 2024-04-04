package assignment2_1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long factorial = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + n + " is " + factorial);
		sc.close();
	}

}
