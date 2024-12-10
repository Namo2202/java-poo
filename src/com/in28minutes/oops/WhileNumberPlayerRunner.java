package com.in28minutes.oops;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(30);

//		player.printSquaresUpToLimit();
//
//		System.out.println();
//
//		player.printCubesUpToLimit();

		System.out.println(player.getLastDigitOfNumber());
	}

}
