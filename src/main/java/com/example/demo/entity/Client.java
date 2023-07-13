package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class Client {
	
			@Id
			@GeneratedValue()

			private long client_ID;

			private long advisor_id;
			
			@Column(nullable = false)
			private String name;
			
			@Column(nullable = false)
		    private String email;
		    
			@Column(nullable = false)
		    private String address;
		    
		    
		    //Constructor

			public Client(long client_ID, long advisor_id, String name, String email, String address) {
				super();
				this.name = name;
				this.email = email;
				this.address = address;
			}

		


           //Getter and Setter methods
			public long getClient_ID() {
				return client_ID;
			}


			public long getAdvisor_id() {
				return advisor_id;
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				this.email = email;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}

}
