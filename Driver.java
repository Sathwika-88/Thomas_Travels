package com;

public class Driver {
	private String category;
	private int id;
	private String driverName;
	private double distance;
	Driver(){
		this.category = null;
		this.id = 0;
		this.driverName = null;
		this.distance = 0;
	}
	Driver(int id,String category,String driverName,double distance)
	{
		this.id = id;
		this.category = category;
		this.driverName = driverName;
		this.distance = distance;
	}
	public String getCategory() {
		return category;
	}
	public int getId() {
		return id;
	}
	public String getDriverName() {
		return driverName;
	}
	public double getDistance() {
		return distance;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCategory(int id) {
		this.id = id;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

}
