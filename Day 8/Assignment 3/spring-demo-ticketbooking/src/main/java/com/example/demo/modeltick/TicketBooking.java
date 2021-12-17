package com.example.demo.modeltick;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Table(name="UserInfo")
public class TicketBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="travels_name")
	private String travels_name;
	
	@Column(name="fromPlace")
	private String fromPlace;
	
	@Column(name="toPlace")
	private String toPlace;
	
	public TicketBooking() {
		
	}

	public TicketBooking(int id, String travels_name, String fromPlace, String toPlace) {
		super();
		this.id = id;
		this.travels_name = travels_name;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravels_name() {
		return travels_name;
	}

	public void setTravels_name(String travels_name) {
		this.travels_name = travels_name;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	@Override
	public String toString() {
		return "TicketBooking [id=" + id + ", travels_name=" + travels_name + ", fromPlace=" + fromPlace + ", toPlace="
				+ toPlace + "]";
	}
	
	
	

}
