package assignment2;

import java.util.Scanner;

public class Circle {

	private float radius, result;

	final float PI = 3.14f;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the radius of circle.");
		radius = sc.nextFloat();
	}

	public void calculateArea() {
		result = PI * (radius * radius); 
	}

	public void displayArea() {
		System.out.println("Area of circle is " + result);
	}
}
