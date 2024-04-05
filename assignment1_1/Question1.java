package assignment1_1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int max;
		System.out.println("Enter the 5 integer number ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Integer number");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		max = arr[0];
		for (int i = 0; i < 5; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest number : " + max);
		sc.close();
	}
}
