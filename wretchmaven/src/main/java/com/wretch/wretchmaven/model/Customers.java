package com.wretch.wretchmaven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Customers")
public class Customers {
	public Customers() {
		
	}
	public Customers(Customers customers) {
		this.active = customers.getActive();
		this.email = customers.getEmail();
		this.username = customers.getUsername();
		this.gender = customers.getGender();
		this.name = customers.getName();
		this.lastname = customers.getLastname();
		this.password = customers.getPassword();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "gender")
	private String gender;
	@Column(name = "active")
	private int active;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
	this.active = active;
	}
	
}
