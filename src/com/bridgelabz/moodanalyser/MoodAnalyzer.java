package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

	String message;
	public static MoodAnalyzer instance;
	
	private MoodAnalyzer() {
		
	}
	
	public static MoodAnalyzer getInstance() {
		if(instance == null) {
			instance = new MoodAnalyzer();
		}
		return instance;
	}
	
	public String analyzeMood(String message) {
		if(message.toLowerCase().contains("sad")) {
			this.message = "SAD";
		}else {
			this.message = "HAPPY";
		}
		return this.message;
		
	}
}
