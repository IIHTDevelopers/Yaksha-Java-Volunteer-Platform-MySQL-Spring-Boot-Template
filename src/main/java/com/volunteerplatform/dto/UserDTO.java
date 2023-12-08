package com.volunteerplatform.dto;

import java.util.Set;

import com.volunteerplatform.entity.Event;

public class UserDTO {

	private long id;

	private String username;

	private String password;

	private String email;

	private boolean isLoggedIn;

	private Set<Event> enrolledEvents;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public UserDTO() {
		super();
	}

	public UserDTO(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
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

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", email=" + email + "]";
	}
}
