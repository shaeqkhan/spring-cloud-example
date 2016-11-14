package io.spring.cloud;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.cloud.model.Reservation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "reservations-controller", description = "endpoints for operations on reservations")
@RestController
public class ReservationsController {
	
	private static final Logger LOG = Logger.getLogger(ReservationsController.class);
	
	@Autowired
	private ReservationsIntegration integration;
	
	@ApiOperation(value = "/id/{reservationID}", notes = "default call to this aggregator", response = Reservation.class)
	@RequestMapping(value = "/id/{reservationID}", method = RequestMethod.GET, produces = "application/json")
	public Reservation getReservation(@PathVariable String reservationID) {
		
		LOG.info("controller....");
		LOG.info(integration.getStatus());
		return integration.getReservation(reservationID);
		
	}
	
	
}