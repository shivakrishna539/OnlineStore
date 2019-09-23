package com.example.vsh.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BiscuitModel {

	@Id
    @GeneratedValue
    private long id;
	
	@Column
    private String companyName;
	
	@Column
    private int quantity;
	
	@Column
    private String biscuitType;
	
	@Column
    private float costPrice;
	
	@Column
    private float salePrice;
	
	@Column
    private float totalCost;
	
	@Column
    private float totalSale;
	
	@Column
    private float totalProfit;
	
	@OneToOne
    private SalesModel salesModel;
	
	public SalesModel getSalesModel() {
		return salesModel;
	}

	public void setSalesModel(SalesModel salesModel) {
		this.salesModel = salesModel;
	}

	@JsonIgnore
	@Column
    private String barCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBiscuitType() {
		return biscuitType;
	}

	public void setBiscuitType(String biscuitType) {
		this.biscuitType = biscuitType;
	}

	public float getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(float costPrice) {
		this.costPrice = costPrice;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(float totalSale) {
		this.totalSale = totalSale;
	}

	public float getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(float totalProfit) {
		this.totalProfit = totalProfit;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	};
	
	

}
