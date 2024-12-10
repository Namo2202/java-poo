package com.in28minutes.oops;

public class BiNumber {

	private int number1;
	private int number2;

	public BiNumber(int n1, int n2) {
		this.number1 = n1;
		this.number2 = n2;
	}

	public int add() {
		return this.number1 + this.number2;
	}

	public int multiply() {
		return this.number1 * this.number2;
	}

	public void doubleNumbers() {
		this.number1 += this.number1;
		this.number2 += this.number2;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}
}
