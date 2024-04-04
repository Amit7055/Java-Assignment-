package assignment2;

import java.util.Scanner;

public class Numbers {
	private int num1, num2, result;
	Scanner sr = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter 2 number......");
		num1=sr.nextInt();
		num2=sr.nextInt();
	}
	public void calculateTotal()
	{
		result=num1+num2;
	}
	public void displayTotal()
	{
		System.out.println(num1+" + "+num2+" = "+result);
	}
}
