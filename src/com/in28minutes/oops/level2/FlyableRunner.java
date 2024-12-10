package com.in28minutes.oops.level2;

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("with the wings");
	}
}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("with fuel");
	}
}

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyables = { new Bird(), new Aeroplane() };
		for (Flyable flyable : flyables) {
			flyable.fly();
		}
	}

}
