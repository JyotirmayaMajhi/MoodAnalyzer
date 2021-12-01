package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {

	Mood mood;
	enum Mood{NullMood, Happy, Sad};
	
	MoodAnalysisException(Mood mood, String message){
		super(message);
		this.mood = mood;
	}
}
