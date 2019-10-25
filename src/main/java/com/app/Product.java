package com.app;

import java.util.Map;

public class Product {

	private Map<Integer, String> modes;

	public Product() {
		super();
	}

	public Map<Integer, String> getModes() {
		return modes;
	}

	public void setModes(Map<Integer, String> modes) {
		this.modes = modes;
	}

	@Override
	public String toString() {
		return "Product []";
	}

}
