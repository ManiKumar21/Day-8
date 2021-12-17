package com.example.demo.interrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modeltick.TicketBooking;

public interface TickRepo extends JpaRepository<TicketBooking, Integer> {

	List<TicketBooking> findByFromPlaceAndToPlace(String fromPlace, String toPlace);

	List<TicketBooking> findByFromPlaceContainsOrToPlaceContainsAllIgnoreCase(String fromPlace, String toPlace);

	// JPQL Query

	@Query(value = "select new com.example.demo.interrepo.TicketFromToPlace(Tick.fromplace, Tick.name) from TicketBooking Tick")
	List<TicketBooking> findByLetter();

	// native Query

	@Query(value = "select U.fromplace, U.toplace from TicketBooking Tickettooking", nativeQuery = true)
	List<Object[]> findXyz();

}
