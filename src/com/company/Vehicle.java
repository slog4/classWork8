package com.company;

import java.util.Date;

public class Vehicle {
	protected int coordinate;
	protected int prise;
	protected int speed;
	protected Date age;

	@Override
	public String toString() {
		return "Vehicle{" +
				"coordinate=" + coordinate +
				", prise=" + prise +
				", speed=" + speed +
				", age=" + age +
				'}';
	}

	public Vehicle(int coordinate, int prise, int speed, Date age) {
		setCoordinate(coordinate);
		setPrise(prise);
		setSpeed(speed);
		setAge(age);
	}

	public int getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(int coordinate) {
		this.coordinate = coordinate;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}



	protected void move() {

	}
}
