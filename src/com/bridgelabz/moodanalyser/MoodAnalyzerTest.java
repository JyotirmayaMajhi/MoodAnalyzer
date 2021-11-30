package com.bridgelabz.moodanalyser;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

public static MoodAnalyzer mood;
	
	@BeforeClass
	public static void init() {
		System.out.println("Starting");
		mood = MoodAnalyzer.getInstance();
	}
	
	@Test
	public void givenMessageShouldReturnSad() {
		String message = "I am in  Sad Mood";
		
		String actualMessage = mood.analyzeMood(message) ;
	}
}
