package assignment2_1;

public class SumOfFirst10NaturalNumber {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.print(sum + " ");

	}

}
