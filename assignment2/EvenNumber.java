package assignment2;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();

		while (num1 <= num2) {
			if (num1 % 2 == 0)
				System.out.println(num1);
			num1++;
		}

		scanner.close();
	}
}
