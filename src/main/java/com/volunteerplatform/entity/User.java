package com.volunteerplatform.entity;

import java.util.Set;

public class User {

	private Long id;

	private String username;

	private String password;

	private String email;

	private boolean isAdmin;
	private boolean isLoggedIn;

	private Set<Event> enrolledEvents;

	public User() {
		super();
	}

	public User(Long id, String username, String password, String email, boolean isAdmin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.isAdmin = isAdmin;
	}

	public Set<Event> getEnrolledEvents() {
		return enrolledEvents;
	}

	public void setEnrolledEvents(Set<Event> enrolledEvents) {
		this.enrolledEvents = enrolledEvents;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", isAdmin=" + isAdmin + "]";
	}
}
