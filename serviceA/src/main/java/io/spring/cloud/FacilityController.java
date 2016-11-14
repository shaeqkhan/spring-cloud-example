package io.spring.cloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.spring.cloud.model.Facility;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "facility-controller", description = "endpoints for service A")
@RestController
@RequestMapping("/facilities")
public class FacilityController {
	
	@Autowired
	private FacilityIntegration integration;
	
	@ApiOperation(value = "/id/{facilityID}", notes = "GET a facility for a facility ID", response = Facility.class)
	@RequestMapping(value = "/id/{facilityID}", method = RequestMethod.GET, produces = "application/json")
	public Facility getFacility(@PathVariable int facilityID) {
		
		return integration.getFacility(facilityID);
		
	}
	
	@ApiOperation(value = "/user", notes = "GET facilities for a user", response = List.class)
	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
	public List<Facility> getFacilitiesForUser(@RequestParam(value="username") String username) {
		
		return Arrays.asList(new Facility("Facility A", "1234AB", "987-654-3210"),
				new Facility("Facility B", "1234RF", "123-456-7890"),
				new Facility("Facility C", "1234HG", "741-852-9630"));
		
	}
	
}