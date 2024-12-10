package com.in28minutes.oops;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculateArea() {
		if (this.side <= 0) {
			return -1;
		} else {
			return side * side;
		}
	}

	public int calculatePerimeter() {
		if (this.side <= 0) {
			return -1;
		} else {
			return 4 * side;
		}
	}

}
