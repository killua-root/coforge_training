package com.coforge.model;

import java.util.List;

public class Customer {
	private int cId;
	private String cName;
	private List<String> emails;
	private List<DeliveryAddress> deliveryAddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cId, String cName, List<String> emails, List<DeliveryAddress> deliveryAddress) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.emails = emails;
		this.deliveryAddress = deliveryAddress;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<DeliveryAddress> getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(List<DeliveryAddress> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", emails=" + emails + ", deliveryAddress="
				+ deliveryAddress + "]";
	}
	
}
