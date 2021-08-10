package com.company;

import java.util.Date;

public class Plane extends Vehicle {
	public Plane(int coordinate, int prise, int speed, Date age, int height, int numberOfPassengers) {
		super(coordinate, prise, speed, age);
		this.height = height;
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int height;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	private int numberOfPassengers;

	@Override
	public String toString() {
		return "Plane{" +
				"height=" + height +
				", numberOfPassengers=" + numberOfPassengers +
				", coordinate=" + coordinate +
				", prise=" + prise +
				", speed=" + speed +
				", age=" + age +
				'}';
	}
}
