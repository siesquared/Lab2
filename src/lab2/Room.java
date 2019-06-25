package lab2;

import java.util.Scanner;

public class Room {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Length: ");
		double length = input.nextDouble();
		System.out.println("Enter Width: ");
		double width = input.nextDouble();
		System.out.println("Enter Hight: ");
		double hight = input.nextDouble();

		double perimeter = 2 * (length + width);

		double volume = (hight * length * width);

		System.out.println("Area: " + length * width);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume: " + volume);
	}

}
