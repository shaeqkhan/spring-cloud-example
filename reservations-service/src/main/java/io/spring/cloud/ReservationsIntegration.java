package io.spring.cloud;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.spring.cloud.model.Customer;
import io.spring.cloud.model.Employee;
import io.spring.cloud.model.Facility;
import io.spring.cloud.model.Reservation;

@Component
public class ReservationsIntegration {
	
	private static final Logger LOG = Logger.getLogger(ReservationsIntegration.class);
	
	@Autowired
	private ReservationsGateway gateway;
	
	//hystrix annotated method, for calls to gateway methods that make load balanced calls to services
	@HystrixCommand(fallbackMethod = "defaultReservation")
	public Reservation getReservation(String reservationID) {
		
		//synchronous calls
		Facility facility = gateway.getFacility("1");
		Customer customer = gateway.getCustomer("1");
		Employee employee = gateway.getEmployee("1");
		
		Reservation reservation = new Reservation();
		reservation.setReservationID(reservationID);
		reservation.setFacilityName(facility.getFacilityName());
		reservation.setFacilityAddress(facility.getAddress());
		reservation.setFacilityPhone(facility.getPhone());
		reservation.setCustomerName(customer.getCustomerName());
		reservation.setCustomerAddress(customer.getAddress());
		reservation.setEmployeeName(employee.getEmployeeID() + " : " + employee.getEmployeeName());
		
		return reservation;
	}
	
	public Reservation defaultReservation(String reservationID) {
		LOG.error("Could not load reservation : " + reservationID);
		return null;
	}
	
	@HystrixCommand(fallbackMethod = "defaultStatus")
	public String getStatus() {
		return "SUCCESS";
	}
	
	public String defaultStatus() {
		LOG.error("Could not load status...");
		return "FAIL";
	}
}
