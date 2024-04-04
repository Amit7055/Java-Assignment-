package assignment2;

import java.util.Scanner;

public class DayType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number (1-7):");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("It is holiday");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("It is a working day");
			break;
		case 7:
			System.out.println("It is a funday");
			break;
		default:
			System.out.println("Invalid choice");
		}

		sc.close();
	}

}
