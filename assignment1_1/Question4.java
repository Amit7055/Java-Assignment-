package assignment1_1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the numbers");
		num = sc.nextInt();
		if (num > 10 && num < 100) {
			System.out.println("number is 2 digit : " + num);
		} else if (num > 100 && num < 1000) {
			System.out.println("number is 3 digit : " + num);
		} else if (num > 1000 && num < 10000) {
			System.out.println("number is 4 digit : " + num);
		} else {
			System.out.println("number is 5 digit : " + num);
		}
		sc.close();
	}

}
