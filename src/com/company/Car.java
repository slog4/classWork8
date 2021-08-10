package com.company;

import java.util.Date;

public class Car extends Vehicle {
	public Car(int coordinate, int prise, int speed, Date age, int liftingСapacity) {
		super(coordinate, prise, speed, age);
		this.liftingСapacity = liftingСapacity;
	}



	private int liftingСapacity;



	@Override
	public String toString() {
		return "Car{" +
				"liftingСapacity= " + liftingСapacity +

				", coordinate=" + coordinate +
				", prise=" + prise +
				", speed=" + speed +
				", age=" + age +
				'}';
	}
}
