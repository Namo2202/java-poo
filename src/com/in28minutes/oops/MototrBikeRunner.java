package com.in28minutes.oops;

public class MototrBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);

		ducati.start();

		System.out.println(ducati.getSpeed());
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());

//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed += 100;
//		ducati.setSpeed(ducatiSpeed);
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());

		honda.increaseSpeed(500);
		System.out.println(honda.getSpeed());
//		ducati.speed = 20;
//		honda.speed = 0;

		ducati.decreaseSpeed(150);
		System.out.println(ducati.getSpeed());
	}

}
