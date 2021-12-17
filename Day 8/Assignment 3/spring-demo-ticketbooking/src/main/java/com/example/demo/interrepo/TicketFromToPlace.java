package com.example.demo.interrepo;

import java.io.Serializable;

public class TicketFromToPlace implements Serializable {
	
	private String fromPlace , toPlace;

	@Override
	public String toString() {
		return "TicketFromToPlace [fromPlace=" + fromPlace + ", toPlace=" + toPlace + "]";
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

	public TicketFromToPlace(String fromPlace, String toPlace) {
		super();
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}
	

}
