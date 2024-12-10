package com.in28minutes.oops;

public class Menu {
	private int n1;
	private int n2;

	public Menu(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int sum() {
		return this.n1 + this.n2;
	}

	public int subtract() {
		return this.n1 - this.n2;
	}

	public int divide() {
		return this.n1 / this.n2;
	}

	public int multiply() {
		return this.n1 * this.n2;
	}

}
