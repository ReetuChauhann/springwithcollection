package com.reetu.beans;

import java.util.List;

public class Book1 {
	private String name;
	private double price;
	private List author; 
	
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
	public List getAuthor() {
		return author;
	}
	public void setAuthor(List author) {
		this.author = author;
	}
}
