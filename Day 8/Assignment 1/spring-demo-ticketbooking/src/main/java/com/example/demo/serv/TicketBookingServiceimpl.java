package com.example.demo.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interrepo.TickRepo;
import com.example.demo.modeltick.TicketBooking;

@Service
public class TicketBookingServiceimpl implements TicketBookingServ {

	@Autowired
	TickRepo tickRepo;

	@Override
	public void createUser(TicketBooking ticketBooking) {
		// TODO Auto-generated method stub
		tickRepo.save(ticketBooking);

	}

	@Override
	public List<TicketBooking> getUser() {
		// TODO Auto-generated method stub

		return (List<TicketBooking>) tickRepo.findAll();
	}

	@Override
	public TicketBooking findById(int id) {
		// TODO Auto-generated method stub
		return tickRepo.findById(id).get();
	}

	@Override
	public TicketBooking update(TicketBooking ticketBooking, int Id) {
		// TODO Auto-generated method stub
		return tickRepo.save(ticketBooking);
	}

	@Override
	public List<TicketBooking> findByFromPlaceAndToPlace(String fromplace, String toplace) {
		return tickRepo.findByFromPlaceAndToPlace(fromplace, toplace);
	}

}
