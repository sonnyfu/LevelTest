package com.sonny.LevelTest;

import static org.junit.Assert.assertArrayEquals;

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
	
	ArrayList<String>  expectedArray=new ArrayList<>();
	
    @Before
    public void init() {
    	System.out.println("开始测试-----------------");
    	expectedArray.add("ad");
    	expectedArray.add("ae");
    	expectedArray.add("af");
    	expectedArray.add("bd");
    	expectedArray.add("be");
    	expectedArray.add("bf");
    	expectedArray.add("cd");
    	expectedArray.add("ce");
    	expectedArray.add("cf");
    }
    
	@Test
	public void letterCombinations() {
		
		ArrayList<String> res=combinationHelper.letterCombinations("23");
		assertArrayEquals(expectedArray.toArray(), res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("");
		assertArrayEquals(new Object[] {}, res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations(null);
		assertArrayEquals(new Object[] {}, res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("1");
		assertArrayEquals(new Object[] {}, res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("0");
		assertArrayEquals(new Object[] {}, res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("2");
		assertArrayEquals(new Object[] {"a","b","c"}, res.toArray());
		for(String s:res)
			System.out.println(s);
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("0123");
		assertArrayEquals(expectedArray.toArray(), res.toArray());
		for(String s:res)
			System.out.println(s);		
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("203");
		assertArrayEquals(expectedArray.toArray(), res.toArray());
		for(String s:res)
			System.out.println(s);	
		System.out.println("=========");
		
		res=combinationHelper.letterCombinations("230");
		assertArrayEquals(expectedArray.toArray(), res.toArray());
		for(String s:res)
			System.out.println(s);	
		System.out.println("=========");		
	}
 
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

	


}
