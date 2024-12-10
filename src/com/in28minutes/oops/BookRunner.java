package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputer = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputer.print();
		effectiveJava.print();
		cleanCode.print();
	}

}
