package com.in28minutes.oops;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
