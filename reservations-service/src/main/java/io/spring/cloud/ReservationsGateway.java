package io.spring.cloud;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.spring.cloud.model.Customer;
import io.spring.cloud.model.Employee;
import io.spring.cloud.model.Facility;

@Component
public class ReservationsGateway {
	
	private static final Logger LOG = Logger.getLogger(ReservationsGateway.class);
	private static final String SERVICE_A = "serviceA";
	private static final String SERVICE_B = "serviceB";
	
	@Autowired  
	private LoadBalancerClient loadBalancer;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	//call to serviceA to get facility
	public Facility getFacility(String facilityID) {
		String url = "http://" + getService(SERVICE_A).getHost() + ":" + getService(SERVICE_A).getPort() + 
				"/" + SERVICE_A + "/facilities/id/" + facilityID;
		LOG.info("URL : " + url);
		return (Facility)restTemplate.getForObject(url, Facility.class);
	}
	
	//call to serviceB to get customer
	public Customer getCustomer(String customerID) {
		String url = "http://" + getService(SERVICE_B).getHost() + ":" + getService(SERVICE_B).getPort() + 
				"/" + SERVICE_B + "/customers/id/" + customerID;
		LOG.info("URL : " + url);
		return (Customer)restTemplate.getForObject(url, Customer.class);
	}
	
	//call to serviceB to get employee
	public Employee getEmployee(String employeeID) {
		String url = "http://" + getService(SERVICE_B).getHost() + ":" + getService(SERVICE_B).getPort() + 
				"/" + SERVICE_B + "/employees/id/" + employeeID;
		LOG.info("URL : " + url);
		return (Employee)restTemplate.getForObject(url, Employee.class);
	}
	
	private ServiceInstance getService(final String serviceName) {
		return loadBalancer.choose(serviceName);
	}
	
}
