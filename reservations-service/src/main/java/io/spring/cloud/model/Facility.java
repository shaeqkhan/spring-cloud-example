package io.spring.cloud.model;

public class Facility {
	
	private String facilityName;
	private String address;
	private String phone;
	
	public Facility() {}
	
	public Facility(String facilityName, String address, String phone) {
		super();
		this.facilityName = facilityName;
		this.address = address;
		this.phone = phone;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}