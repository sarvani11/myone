package edu.asu.diging.tutorial.spring.domain;
 

public class Mood {

	private String feeling;
	private String explanation;

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	public Mood(String mood, String explanation) {
		super();
		this.feeling = mood;
		this.explanation = explanation;
	}
	
	
}