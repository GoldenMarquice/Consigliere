package com.consigliere.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="gainerslosers")
public class Collection {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "stockName")
	private String stockName;
	
	@Column(name = "change")
	private float change;
	
	@Column(name = "stockPrice")
	private float stockPrice;
	
	@Column(name = "percentageChange")
	private float percentageChange;
	
	public Collection() {}
	
	public Collection(Integer id, String symbol, String stockName, Float change, Float stockPrice, Float percentageChange) {
	this.id= id;
	this.symbol = symbol;
	this.stockName = stockName;
	this.change = change;
	this.stockPrice = stockPrice;
	this.percentageChange = percentageChange;
	
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public float getChange() {
		return change;
	}

	public void setChange(float change) {
		this.change = change;
	}

	public float getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}

	public float getPercentageChange() {
		return percentageChange;
	}

	public void setPercentageChange(float percentageChange) {
		this.percentageChange = percentageChange;
	}


}
