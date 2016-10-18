package io.spring.cloud.model;

public class Customer {
	
	private String customerName;
	private String address;
	private String phone;
	
	public Customer() {}
	
	public Customer(String customerName, String address, String phone) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}