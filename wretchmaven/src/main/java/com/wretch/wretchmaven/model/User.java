package com.wretch.wretchmaven.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "gender")
	private String gender;
	@Column(name = "country")
	private String country;
	@Column(name = "city")
	private String city;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "street")
	private String street;
	@Column(name = "houseNr")
	private String houseNr;

	public User(String username, String email, String password, String name, String lastname, String gender,
			String country, String city, String zipcode, String street, String houseNr, @NotNull boolean enabled,
			String passwordConfirm) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstname = name;
		this.lastname = lastname;
		this.gender = gender;
		this.country = country;
		this.city = city;
		this.zipcode = zipcode;
		this.street = street;
		this.houseNr = houseNr;
		this.enabled = enabled;
		this.passwordConfirm = passwordConfirm;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNr() {
		return houseNr;
	}

	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}

	@NotNull
	@Column(name = "enabled")
	private boolean enabled;

	@Transient
	private String passwordConfirm;

	public User() {

	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

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
		return firstname;
	}

	public void setName(String name) {
		this.firstname = name;
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

}
