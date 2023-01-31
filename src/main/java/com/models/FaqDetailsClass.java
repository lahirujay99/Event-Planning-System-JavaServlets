package com.models;

public class FaqDetailsClass {
	private int id;
	private String question;
	private String solution;

	public FaqDetailsClass(int id, String question, String solution) {
		super();
		this.id = id;
		this.question = question;
		this.solution = solution;
	}
	
	public int getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public String getSolution() {
		return solution;
	}

}
