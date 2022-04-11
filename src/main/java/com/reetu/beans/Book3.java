package com.reetu.beans;

import java.util.Map;

public class Book3 {
	private String name;
	private double price;
	private Map author;
	public Map getAuthor() {
		return author;
	}
	public void setAuthor(Map author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}