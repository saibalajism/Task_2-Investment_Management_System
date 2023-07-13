package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity	
public class Portfolio {


			@Id
			@GeneratedValue()

			private long portfolio_id;

			private long client_ID;
			
			@Column(nullable = false)
			private String name;
			
			@Column(nullable = false)
		    private Date creation_date;
			
			
			
			//Constructor
			public Portfolio(long client_ID, String name, Date creation_date) {
				super();
				this.name = name;
				this.creation_date = creation_date;
			}
			


            //Getter and Setter methods
			public long getPortfolio_id() {
				return portfolio_id;
			}

			public long getClient_ID() {
				return client_ID;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Date getCreation_date() {
				return creation_date;
			}

			public void setCreation_date(Date creation_date) {
				this.creation_date = creation_date;
			}

}
