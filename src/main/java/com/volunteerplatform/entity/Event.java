package com.volunteerplatform.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Event {

	private Long id;

	private String name;

	private LocalDate date;

	private LocalTime time;

	private String description;

	private Set<User> enrolledUsers;

	public Event() {
		super();
	}

	public Event(Long id, String name, LocalDate date, LocalTime time, String description, Set<User> enrolledIds) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.description = description;
		this.enrolledUsers = enrolledIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getEnrolledUserIds() {
		return enrolledUsers;
	}

	public void setEnrolledUserIds(Set<User> enrolledIds) {
		this.enrolledUsers = enrolledIds;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", date=" + date + ", time=" + time + ", description="
				+ description + ", enrolledUserIds=" + enrolledUsers + "]";
	}
}
