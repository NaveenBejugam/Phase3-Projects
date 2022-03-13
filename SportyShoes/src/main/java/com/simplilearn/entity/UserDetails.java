package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userdetails")
@Table(name = "userdetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long userId;
	public String username;
	public String emailId;
	public String productPurchased;
	public String category;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(long userId, String username, String emailId, String phone, String productPurchased,
			String category) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
		this.productPurchased = productPurchased;

		this.category = category;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProductPerchased() {
		return productPurchased;
	}

	public void setProductPerchased(String productPerchased) {
		this.productPurchased = productPerchased;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", username=" + username + ", emailId=" + emailId + ", phone="
				+ ", productPerchased=" + productPurchased + ", category=" + category + "]";
	}
}
