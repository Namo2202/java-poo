package com.in28minutes.oops;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("The number you entered is: " + number1);
		System.out.print("Enter Number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("The number you entered is: " + number2);

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		int operation = scanner.nextInt();
		System.out.println("Choose Operation: " + operation);

		Menu menu = new Menu(number1, number2);

		performOperation(operation, menu);
	}

	private static void performOperation(int operation, Menu menu) {
//		if (operation == 1) {
//			System.out.println("Result is " + menu.sum());
//		} else if (operation == 2) {
//			System.out.println("Result is " + menu.subtract());
//		} else if (operation == 3) {
//			System.out.println("Result is " + menu.divide());
//		} else if (operation == 4) {
//			System.out.println("Result is " + menu.multiply());
//		}
		switch (operation) {
		case 1: {
			System.out.println("Result is " + menu.sum());
			break;
		}
		case 2: {
			System.out.println("Result is " + menu.subtract());
			break;
		}
		case 3: {
			System.out.println("Result is " + menu.divide());
			break;
		}
		case 4: {
			System.out.println("Result is " + menu.multiply());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}

}
