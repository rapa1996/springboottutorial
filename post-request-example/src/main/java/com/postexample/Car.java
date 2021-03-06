package com.postexample;

public class Car {

	private long id;
	private String color;
	private long price;
	private String model;
	
	public Car() {
		
	}
	public Car(long id, String color, long price, String model) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}	

}
