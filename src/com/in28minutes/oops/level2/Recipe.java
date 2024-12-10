package com.in28minutes.oops.level2;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the rax materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("cleanup");
	}

}
