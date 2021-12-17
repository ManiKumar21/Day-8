package com.example.demo.serv;

import java.util.List;


import com.example.demo.modeltick.TicketBooking;



public interface TicketBookingServ {
	
	public void createUser(TicketBooking ticketBooking);
	public List<TicketBooking> getUser();
	public TicketBooking findById(int id);
	public TicketBooking update(TicketBooking ticketBooking, int Id);
	public List<TicketBooking> findByFromPlaceAndToPlace(String fromplace, String toplace);
}
