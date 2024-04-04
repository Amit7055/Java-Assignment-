package assignment2;

import java.util.Scanner;

public class IntegersTotal {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[] arr = new int[5];
		int total = 0;
		System.out.println("enter 5 integer values...");
		for (int i = 0; i < 5; i++) {
			arr[i] = sr.nextInt();
			total = total + arr[i];
		}
		System.out.println("total of all 5 integers is " + total);
		sr.close();
	}

}
