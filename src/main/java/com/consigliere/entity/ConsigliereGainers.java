package com.consigliere.entity;

public class ConsigliereGainers {


	private String symbol;
	private String name;
	private float change;
	private float price;
	private float changesPercentage;
		    
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getChange() {
		return change;
	}
	public void setChange(float change) {
		this.change = change;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getChangesPercentage() {
		return changesPercentage;
	}
	public void setChangesPercentage(float changesPercentage) {
		this.changesPercentage = changesPercentage;
	}
	
}
