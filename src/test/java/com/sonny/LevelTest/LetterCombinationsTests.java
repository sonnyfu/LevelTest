package com.sonny.LevelTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sonny.LevelTest.util.ICombinationHelper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LetterCombinationsTests {
	
	@Autowired
	private ICombinationHelper combinationHelper; 
	
    @Before
    public void init() {
    	System.out.println("开始测试-----------------");
    }
    
	@Test
	public void letterCombinations() {
		
		ArrayList<String> res=combinationHelper.letterCombinations("234");
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("");
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations(null);
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("1");
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("0");
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("2");
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("0123456789");
		for(String s:res)
			System.out.println(s);		
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("2034");
		for(String s:res)
			System.out.println(s);	
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("2340");
		for(String s:res)
			System.out.println(s);	
		System.out.println("=========");		
	}
 
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

	


}
