package com.spring.model;

public class Bike {
	private String name;
	private String power;
	private String model;
	private float price;
	private Tyre tyre;
	private Light light;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", power=" + power + ", model=" + model + ", price=" + price + ", tyre=" + tyre
				+ ", light=" + light + "]";
	}

}
