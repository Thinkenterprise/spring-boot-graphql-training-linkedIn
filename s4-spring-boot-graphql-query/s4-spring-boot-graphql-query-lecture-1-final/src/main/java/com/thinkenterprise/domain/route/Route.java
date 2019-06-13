package com.thinkenterprise.domain.route;

import javax.persistence.Entity;

import com.thinkenterprise.domain.AbstractEntity;

/**  
* GraphQL Spring Boot Samples 
* Design and Development by Michael Schäfer 
* Copyright (c) 2019 
* All Rights Reserved.
* 
* @author Michael Schäfer
*/

@Entity
public class Route extends AbstractEntity {

	private String flightNumber;
	private String departure;
	private String destination;
	private Boolean disabled;

	public Route() {
		super();
	}

	public Route(String flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}

	public Route(String flightNumber, String departure, String destination, Boolean disabled) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departure = departure;
		this.disabled = disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getDisabled() {
		return this.disabled;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String number) {
		this.flightNumber = number;
	}

}
