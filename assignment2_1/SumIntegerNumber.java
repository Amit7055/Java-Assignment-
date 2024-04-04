package assignment2_1;

import java.util.Scanner;

public class SumIntegerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int sum = 0;
		int n;
		System.out.println("Enter size of integers:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("Sum of digits of given integer number : " + sum);
		sc.close();

	}

}
