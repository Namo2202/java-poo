package com.in28minutes.oops;

public class MotorBike {
	private int speed;

	public MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	void start() {
		System.out.println("Bike started !");
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
