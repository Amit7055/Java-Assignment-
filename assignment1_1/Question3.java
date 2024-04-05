package assignment1_1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("Enter the grade");
		score = sc.nextInt();
		if (score >= 80) {
			System.out.println(score + " : distinction");
		} else if (score < 80 && score >= 60) {
			System.out.println(score + " : first class");
		} else if (score < 60 && score >= 50) {
			System.out.println(score + " : second class");
		} else if (score < 50 && score > 40) {
			System.out.println(score + " : pass");
		} else
			System.out.println("failed");
		sc.close();
	}

}
