package assignment2_1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		boolean flag = true;
		if (num == 0)
			System.out.println("Prime is not  possible for " + num);
		else if (num == 1)
			System.out.println(num + " : is a prime number");
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println(num + " : is an prime number");
			else
				System.out.println(num + " : is not prime number");
			sc.close();
		}
	}

}
