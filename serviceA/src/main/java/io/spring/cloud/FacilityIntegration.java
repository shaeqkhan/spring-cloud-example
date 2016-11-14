package io.spring.cloud;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.spring.cloud.model.Facility;

@Component
public class FacilityIntegration {
	
	@HystrixCommand(fallbackMethod = "defaultFacility")
	public Facility getFacility(int facilityID) {
		return new Facility("Facility A", "1234AB", "987-654-3210");
	}
	
	public Facility defaultFacility(int facilityID) {
		return null;
	}
	
}
