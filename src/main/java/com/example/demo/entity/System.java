package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class System {
	@Id
	@GeneratedValue()

	private long client_ID;
	
	private long portfolio_id;

	private long advisor_id;

	@Column(nullable = false)
    private Date creation_date;

	//Constructor
	public System(Date creation_date) {
		super();
		this.creation_date = creation_date;
	}
	
	
	//Getter and Setter methods
	
	public long getClient_ID() {
		return client_ID;
	}

	public long getPortfolio_id() {
		return portfolio_id;
	}

	public long getAdvisor_id() {
		return advisor_id;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}



					

}
