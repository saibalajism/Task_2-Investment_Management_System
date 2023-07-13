package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity

public class Security {
				@Id
				@GeneratedValue()

				private long security_id;
				
				private long portfolio_id;

				@Column(nullable = false)
				private String name;
				
				@Column(nullable = false)
				private String category;
				
				@Column(nullable = false)
			    private Date purchase_date;
				
				@Column(nullable = false)
				private long purchase_price;
				
				@Column(nullable = false)
				private long quantity;
				
				//Constructor
				
				public Security(String name, String category, long purchase_price, long quantity, Date purchase_date) {
					super();
					this.name = name;
					this.category = category;
					this.purchase_price = purchase_price;
					this.quantity = quantity;
					this.purchase_date = purchase_date;
				}
				
				
				//Getter and Setter methods
				public long getSecurity_id() {
					return security_id;
				}

				
				public long getPortfolio_id() {
					return portfolio_id;
				}

				
				public String getName() {
					return name;
				}


				public void setName(String name) {
					this.name = name;
				}


				public String getCategory() {
					return category;
				}


				public void setCategory(String category) {
					this.category = category;
				}


				public long getPurchase_price() {
					return purchase_price;
				}


				public void setPurchase_price(long purchase_price) {
					this.purchase_price = purchase_price;
				}


				public long getQuantity() {
					return quantity;
				}


				public void setQuantity(long quantity) {
					this.quantity = quantity;
				}


				public Date getPurchase_date() {
					return purchase_date;
				}


				public void setPurchase_date(Date purchase_date) {
					this.purchase_date = purchase_date;
				}

}
