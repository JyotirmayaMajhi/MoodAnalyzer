package com.bridgelabz.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	public static MoodAnalyzer mood;
	private static String message;
	
	public MoodAnalyzerTest() {
		message = null;
	}
	@BeforeClass
	public static void init() {
//		mood = MoodAnalyzer.getInstance();
		mood = new MoodAnalyzer(message);
	}
	
	@Test
	public void givenMessageShouldReturnSad() {
		try {
//		String message = "I am in Sad Mood";
//		mood = new MoodAnalyzer(message);
		String actualMessage = mood.analyzeMood() ;
		assertEquals("SAD",actualMessage);
		}catch(MoodAnalysisException e){
			
		}
	}
	
	@Test
	public void givenMessageShouldReturnHappy()  {
		try {
//		String message = "I am in Happy Mood";
//		mood = new MoodAnalyzer(message);
		String actualMessage = mood.analyzeMood() ;
		assertEquals("HAPPY",actualMessage);
		}catch(MoodAnalysisException e) {
			
		}
	}
	
	
	
	@AfterClass
	public static void endTask() {
		
	}
}
