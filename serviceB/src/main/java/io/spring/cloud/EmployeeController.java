package io.spring.cloud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.cloud.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "employee-controller", description = "endpoints for service B")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@ApiOperation(value = "/id/{employeeID}", notes = "GET employee for employee ID", response = Employee.class)
	@RequestMapping(value = "/id/{employeeID}", method = RequestMethod.GET, produces = "application/json")
	public Employee getFacility(@PathVariable int employeeID) {
		
		return new Employee("Employee A", "E#456789132");
		
	}
	
	
}