package com.company;

import java.util.Date;

public class Ship extends Vehicle {
	public Ship(int coordinate, int prise, int speed, Date age, int numberOfPassengers, String port ) {
		super(coordinate, prise, speed, age);
		this.numberOfPassengers = numberOfPassengers;
		this.port= port;
	}



	private int numberOfPassengers;
	private  String port;



	@Override
	public String toString() {
		return "Ship{" +
				" numberOfPassengers= " + numberOfPassengers +
				", Port= " + port +
				", coordinate=" + coordinate +
				", prise=" + prise +
				", speed=" + speed +
				", age=" + age +
				'}';
	}
}
