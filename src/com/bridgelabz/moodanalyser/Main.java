package com.bridgelabz.moodanalyser;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MoodAnalysisException {
//		System.out.println("How is your Mood?");
//		Scanner sc = new Scanner(System.in);
		
//		String mood = sc.nextLine();
		MoodAnalyzer moodanalyzer = new MoodAnalyzer(" ");
		System.out.println(moodanalyzer.analyzeMood());

	}

}
