package com.coforge.pms.model;

public class Product {
	private int pid;
	private String pName;
	private int pPrice;
	private int pQty;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pName, int pPrice, int pQty) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + "]";
	}
	
}
