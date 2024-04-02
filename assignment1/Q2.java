package assignment1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int num;

		System.out.println("Enter number");
		num = sr.nextInt();

		if (num >=100 && num<1000)
			System.out.println("number is 3 didgit");
		else if(num>=1000&&num<10000)
			System.out.println("number is 4 digit");

	}

}
