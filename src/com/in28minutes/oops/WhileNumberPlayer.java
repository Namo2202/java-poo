package com.in28minutes.oops;

public class WhileNumberPlayer {

	private int number;

	public WhileNumberPlayer(int number) {
		this.number = number;
	}

	public void printSquaresUpToLimit() {
		int i = 1;
		while (i * i < number) {
			System.out.print((i * i) + " ");
			i++;
		}
	}

	public void printCubesUpToLimit() {
		int i = 1;
		while (i * i * i < number) {
			System.out.print((i * i * i) + " ");
			i++;
		}
	}

	public int getLastDigitOfNumber() {
		int length = 0;

		while (number != 0) {
			number /= 10;
			length++;
		}

		return length;
	}

}
