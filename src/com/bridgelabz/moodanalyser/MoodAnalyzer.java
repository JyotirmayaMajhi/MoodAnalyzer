package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

	public static MoodAnalyzer instance;
	private String mood;
	
	private MoodAnalyzer(String mood) {
		this.mood = mood;
	}
	
	public static MoodAnalyzer getInstance(String mood) {
		if(instance == null) {
			instance = new MoodAnalyzer(mood);
		}
		return instance;
	}
	
	public String analyzeMood() {
		if(mood.toLowerCase().contains("sad")) {
			mood = "SAD";
		}else {
			mood = "HAPPY";
		}
		return mood;
		
	}
}
