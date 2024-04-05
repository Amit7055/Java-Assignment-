package assignment2_1;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countPos = 0, countNeg = 0, countZero = 0;
		int num;
		String choice;

		do {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if (num == 0)
				countZero++;
			else if (num > 0)
				countPos++;
			else
				countNeg++;
			System.out.println("Do you want to continue(Y/N)");
			choice = sc.next();
		} while (choice.equals("Y") || choice.equals("y"));

		System.out.println("Total Count of zero number     : " + countZero);
		System.out.println("Total Count of positive number : " + countPos);
		System.out.println("Total Count of negative number : " + countNeg);
		sc.close();
	}

}
