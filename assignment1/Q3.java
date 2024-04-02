package assignment1;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int age;
		System.out.println("Enter number");
		age = sr.nextInt();
		if (age >=18 )
			System.out.println("you are eligible to vote");
		else 
			System.out.println("you are eligible not to vote");
	}

}
