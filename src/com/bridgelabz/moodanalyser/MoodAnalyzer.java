package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalysisException.Mood;

public class MoodAnalyzer {

	String message;
	public static MoodAnalyzer instance;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public static MoodAnalyzer getInstance() {
		if (instance == null) {
			instance = new MoodAnalyzer();
		}
		return instance;
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			if (message == null) {
				throw new MoodAnalysisException(Mood.NullMood, " Null ");
			}
			if (message.toLowerCase().contains("sad")) {
				this.message = "SAD";
			} else {
				this.message = "HAPPY";
			}
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			System.out.println(e);
		}
//		finally {
//		return "Happy";
//		}
		return message;

	}
}
