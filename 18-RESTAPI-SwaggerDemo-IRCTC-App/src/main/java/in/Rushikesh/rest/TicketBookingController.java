package in.Rushikesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Rushikesh.bindings.PassengerInfo;
import in.Rushikesh.bindings.TicketBookingInfo;

@RestController
public class TicketBookingController {
	
	@PostMapping(
				value="/bookTicket",
				produces = {"application/xml", "application/json"},
				consumes = {"application/xml", "application/json"}
			)
	public ResponseEntity<TicketBookingInfo> bookTicket(@RequestBody PassengerInfo data){
		System.out.println("Passenger details are : " + data);
		//logic to book the ticket
		
		TicketBookingInfo payload = new TicketBookingInfo(12, data.getName(), "S2:25", "Mondovi express");
		return new ResponseEntity<>(payload, HttpStatus.CREATED);
	}
	
	
}
