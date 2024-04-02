package assignment1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int num;

		System.out.println("Enter number");
		num = sr.nextInt();

		if (num > 0)
			System.out.println("number is +ve");
		else
			System.out.println("number is -ve");

	}

}
