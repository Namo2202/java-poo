package com.in28minutes.oops.level2;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("wouaf wouaf");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("meow meow");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.bark();
		}
	}

}
