package com.spring.model;

public class Light {
	private String color;
	private String range;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Light [color=" + color + ", range=" + range + "]";
	}

}
