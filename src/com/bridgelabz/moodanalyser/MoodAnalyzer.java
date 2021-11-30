package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

	String message;
	public static MoodAnalyzer instance;
	
	public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public static MoodAnalyzer getInstance() {
		if(instance == null) {
			instance = new MoodAnalyzer();
		}
		return instance;
	}
	
	public String analyzeMood() {
		try {
		if(message.toLowerCase().contains("sad")) {
			this.message = "SAD";
		}else {
			this.message = "HAPPY";
		}
		}catch(Exception e) {
			return "HAPPY";
		}
//		finally {
//		return this.message;
//		}
		return message;
	  
	}
}

