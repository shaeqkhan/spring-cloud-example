package io.spring.cloud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.cloud.model.Customer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "customer-controller", description = "endpoints for service B")
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@ApiOperation(value = "/id/{customerID}", notes = "GET a customer for a customer ID", response = Customer.class)
	@RequestMapping(value = "/id/{customerID}", method = RequestMethod.GET, produces = "application/json")
	public Customer getCustomer(@PathVariable int customerID) {
		
		return new Customer("Person A", "1234AB", "987-654-3210");
		
	}
		
}