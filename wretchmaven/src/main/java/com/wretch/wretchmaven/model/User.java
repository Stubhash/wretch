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
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "gender")
	private String gender;
	@NotNull
	@Column(name = "enabled")
	private boolean enabled;

	@Transient
	private String passwordConfirm;

	public User() {
		
	}

	public User(String username, String email, String password, String name, String lastname, String gender, int active,
		 boolean enabled, String passwordConfirm) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		
		this.enabled = enabled;
		this.passwordConfirm = passwordConfirm;
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



}
