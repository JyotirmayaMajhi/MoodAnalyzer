package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

public static MoodAnalyzer mood;
	
	@BeforeClass
	public static void init() {
		mood = MoodAnalyzer.getInstance();
	}
	
	@Test
	public void givenMessageShouldReturnSad() {
		String message = "I am in Sad Mood";
		mood = new MoodAnalyzer(message);
		String actualMessage = mood.analyzeMood() ;
		assertEquals("SAD",actualMessage);
	}
	
	@Test
	public void givenMessageShouldReturnHappy() {
		String message = "I am in Happy Mood";
		mood = new MoodAnalyzer(message);
		String actualMessage = mood.analyzeMood() ;
		assertEquals("HAPPY",actualMessage);
	}
	
	@AfterClass
	public static void endTask() {
		
	}
}
