package com.models;

public class BudgetDetailsClass {
	private int id;
	private String eventType;
	private String eventGuest;
	private String eventDate;
	private String eventVenue;
	private String eventMessage;
	private String username;
	private String budget;
	
	public BudgetDetailsClass(int id, String eventType, String eventGuest, String eventDate, String eventVenue,
			String eventMessage, String username, String budget) {
		super();
		this.id = id;
		this.eventType = eventType;
		this.eventGuest = eventGuest;
		this.eventDate = eventDate;
		this.eventVenue = eventVenue;
		this.eventMessage = eventMessage;
		this.username = username;
		this.budget = budget;
	}
	
	public int getId() {
		return id;
	}

	public String getEventType() {
		return eventType;
	}

	public String getEventGuest() {
		return eventGuest;
	}

	public String getEventDate() {
		return eventDate;
	}

	public String getEventVenue() {
		return eventVenue;
	}

	public String getEventMessage() {
		return eventMessage;
	}

	public String getUsername() {
		return username;
	}

	public String getBudget() {
		return budget;
	}

	
}
