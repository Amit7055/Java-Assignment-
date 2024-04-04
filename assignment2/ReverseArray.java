package assignment2;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[7];
		int start = 0;
		int end = array.length - 1;
		int temp = 0;

		System.out.println("Enter 7 integers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Before reserve");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("After reserve");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}

}
