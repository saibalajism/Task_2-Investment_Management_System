package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Financial_Advisor {

		@Id
		@GeneratedValue()

		private long advisor_id;
		
		@Column(nullable = false)
		private String name;

		@Column(nullable = false)
	    private String address;

		@Column(nullable = false)
	    private String phone;

		@Column(nullable = false)
	    private String email;
	    
	    //Constructor

		public Financial_Advisor(long advisor_id, String name, String address, String phone, String email) {
			super();
			this.name = name;
			this.address = address;
			this.phone = phone;
			this.email = email;
		}


	  //Getter and Setter methods
		
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


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}

}
