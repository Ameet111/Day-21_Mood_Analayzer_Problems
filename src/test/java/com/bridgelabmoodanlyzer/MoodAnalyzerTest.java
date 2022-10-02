package com.bridgelabmoodanlyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzerMood();
        Assert.assertEquals("SAD", mood);
}

}
