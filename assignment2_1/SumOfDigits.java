package assignment2_1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("enter the number:");
		num = sc.nextInt();
		int temp = num;
		while (temp != 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		System.out.println("Sum of " + num + " is " + sum);
		sc.close();
	}

}
