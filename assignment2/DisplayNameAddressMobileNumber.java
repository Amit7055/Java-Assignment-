package assignment2;

import java.util.Scanner;

public class DisplayNameAddressMobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long mobileNumber;
		String name, address;

		System.out.println("Enter name,address,mobile number......");
		name = sc.nextLine();
		address = sc.nextLine();
		mobileNumber = sc.nextLong();

		sc.nextLine();

		System.out.println("Name          : " + name);
		System.out.println("Address       : " + address);
		System.out.println("Mobile Number : " + mobileNumber);

		sc.close();
	}

}
