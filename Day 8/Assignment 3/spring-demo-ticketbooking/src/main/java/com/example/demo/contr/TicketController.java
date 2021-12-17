package com.example.demo.contr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.modeltick.TicketBooking;
import com.example.demo.serv.TicketBookingServ;
import com.example.demo.serv.TicketBookingServiceimpl;



@RestController
@RequestMapping(value={"/user"})
public class TicketController {
	
	@Autowired
	TicketBookingServ ticketBookingServ;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TicketBooking> getUserById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        ticketBookingServ.getUser();
        TicketBooking user = ticketBookingServ.findById(id);
        if (user == null) {
            return new ResponseEntity<TicketBooking>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TicketBooking>(user, HttpStatus.OK);
    }
	
	
	 @PostMapping(value="/create",headers="Accept=application/json")
	 public ResponseEntity<Void> createUser(@RequestBody TicketBooking ticket, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating User "+ticket.getFromPlace());
	     ticketBookingServ.createUser(ticket);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(ticket.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }
	
	  @GetMapping(value = "getfromplacetoplace/{fromplace}/{toplace}", headers =
	  "Accept=application/json") public List<TicketBooking>
	  getByFromplaceAndToPlace(@PathVariable String fromplace ,String toplace) {
	  List<TicketBooking> ticketfromplacetoplace =
	  ticketBookingServ.findByFromPlaceAndToPlace(fromplace, toplace); return
	  ticketfromplacetoplace; }
	 
    
	
	 @GetMapping(value="/get", headers="Accept=application/json")
	 public List<TicketBooking> getAllUser() {	 
	  List<TicketBooking> tasks=ticketBookingServ.getUser();
	  return tasks;
	
	 }
	 
	

	@PutMapping(value="/update", headers="Accept=application/json")
	public ResponseEntity<String> updateUser(@RequestBody TicketBooking currentUser)
	{
		System.out.println("sd");
		TicketBooking user = ticketBookingServ.findById(currentUser.getId());
	if (user==null) {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	ticketBookingServ.update(currentUser, currentUser.getId());
	return new ResponseEntity<String>(HttpStatus.OK);
	
	}
	
	
	
}
