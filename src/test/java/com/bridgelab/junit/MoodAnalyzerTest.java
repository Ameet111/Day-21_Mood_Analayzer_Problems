package com.bridgelab.junit;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	 @Test
	    public void given_SadMood_Should_Return_Sad() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	        String mood = moodAnalyzer.MoodAnalyzer("I am In a Sad Mood");
	        Assert.assertEquals("SAD", mood);
}
	  
	  @Test
		public void given_AnyMood_Should_Return_HAPPY() {
			MoodAnalyzer moodAnalyser = new MoodAnalyzer();
			String mood = moodAnalyser.MoodAnalyzer("I am in Any Mood");
			Assert.assertEquals("HAPPY", mood);
   }

}
