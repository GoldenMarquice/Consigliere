package com.consigliere.entity;

public class ConsigliereCryptos {


	private String symbol;
	private String name;
	private float change;
	private float price;
	private float changesPercentage;
	private float yearHigh;
	private float yearLow;
	
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
	public float getYearLow() {
		return yearLow;
	}
	public void setYearLow(float yearLow) {
		this.yearLow = yearLow;
	}
	public float getYearHigh() {
		return yearHigh;
	}
	public void setYearHigh(float yearHigh) {
		this.yearHigh = yearHigh;
	}
	
}
