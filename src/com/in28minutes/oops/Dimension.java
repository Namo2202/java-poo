package com.in28minutes.oops;

public class Dimension {
	private int feet;
	private int inches;

	public Dimension(int inches) {
		// TODO: Convert the total inches into feet and inches. One foot is 12 inches.
		if (inches >= 0) {
			this.feet = inches / 12;
			this.inches = inches % 12;
		} else {
			this.feet = -1;
			this.inches = -1;
		}
	}

	public int getFeet() {
		// TODO: Return the value of feet.
		return this.feet;
	}

	public int getInches() {
		// TODO: Return the value of inches.
		return this.inches;
	}
}
