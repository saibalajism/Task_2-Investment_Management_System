package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Database {

		@Id
		@GeneratedValue()

		private long client_ID;
		
		private long advisor_id;

		@Column(nullable = false)
		private String name;

		@Column(nullable = false)
	    private String address;

		@Column(nullable = false)
	    private String email;
		
		//Constructor
		public Database(String name, String address, String email) {
			super();
			this.name = name;
			this.address = address;
			this.email = email;
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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
}
