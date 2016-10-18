package io.spring.cloud.model;

public class Employee {
	
	private String employeeName;
	private String employeeID;
	
	public Employee() {}
	
	public Employee(String employeeName, String employeeID) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
		
}