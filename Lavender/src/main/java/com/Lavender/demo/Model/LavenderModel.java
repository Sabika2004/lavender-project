package com.Lavender.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LavenderModel {
	@Id
	
	private String Itemname;
	private String Brandname;
	private String Straptype;
	private int Size;
	private int Cost;
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public String getStraptype() {
		return Straptype;
	}
	public void setStraptype(String straptype) {
		Straptype = straptype;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
}