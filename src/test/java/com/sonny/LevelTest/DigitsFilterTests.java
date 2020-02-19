package com.sonny.LevelTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sonny.LevelTest.util.ICombinationHelper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DigitsFilterTests {
	
	@Autowired
	private ICombinationHelper combinationHelper; 
	
	@Test
	public void digitsFilter() {
		Assert.assertEquals("", combinationHelper.digitsFilter(""));
		Assert.assertEquals("", combinationHelper.digitsFilter(null));
		Assert.assertEquals("", combinationHelper.digitsFilter("1"));
		Assert.assertEquals("", combinationHelper.digitsFilter("0"));
		Assert.assertEquals("234", combinationHelper.digitsFilter("2034"));
		Assert.assertEquals("234", combinationHelper.digitsFilter("2340"));
	}
	
}
