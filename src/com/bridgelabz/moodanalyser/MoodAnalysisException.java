package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {

	Mood mood;
	enum Mood{NullMood};
	
	MoodAnalysisException(Mood mood, String message){
		this.mood = mood;
	}
}
