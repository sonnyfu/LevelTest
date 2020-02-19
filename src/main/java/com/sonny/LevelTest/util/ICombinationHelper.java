package com.sonny.LevelTest.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 常用组合算法接口
 * @author sonny
 * @since 2019 20 20
 */
public interface ICombinationHelper {
	
	/**
	 * 获取字符对Map
	 * @return Map<String, String>
	 */
	default  Map<String, String>  getLetterMap() {
		  Map<String, String>  letterMap=new HashMap<String, String>();
		  letterMap.put("0", " ");
		  letterMap.put("1", "");
		  letterMap.put("2", "abc");
		  letterMap.put("3", "def");
		  letterMap.put("4", "ghi");
		  letterMap.put("5", "jkl");
		  letterMap.put("6", "mno");
		  letterMap.put("7", "pqrs");
		  letterMap.put("8", "tuv");
		  letterMap.put("9", "wxyz");
		  return letterMap;
	}
	
	/**
	 * 判断是否要被忽略
	 * @param ignorableString 
	 * @return boolean
	 */
	default  boolean  isIgnored(String ignorableString) {
		if("0".equals(ignorableString)) {
			return true;
		}else if("1".equals(ignorableString)){
			return true;
		}else {
			return false;
		}
	}
	
	  /**
	   * 寻找所有可能的组合
	   * @param digits 被组合的字符串
	   * @param index 字符位置
	   * @param savedString 保存了对digits[0..index-1]映射得到的组合
	   * @param letterMap 字符对Map
	   * @param 接收组合的list
	   * @return ArrayList<String>
	   */
	  default void findCombination(String digits, int index, String savedString,Map<String,String> letterMap,ArrayList result){

	      if(index == digits.length()){
	    	  result.add(savedString);
	          return;
	      }

	      String digit = digits.substring(index, index+1);
	      
	      String letters = letterMap.get(digit);
	      for(int i = 0 ; i < letters.length() ; i ++)
	          findCombination(digits, index+1, savedString + letters.charAt(i),letterMap,result);
	      return;
	  }
	
	  /**
	   * 过滤字符
	   * @param digits
	   * @return String
	   */
	  default String digitsFilter(String digits) {
		  
	      if("".equals(digits)||digits==null) {
	    	  return "";
	      }
		  
		  StringBuffer strBuf=new StringBuffer("");
		  for(int index=0;index<digits.length();index++) {
			  String filterStr=digits.substring(index, index+1);
			  if(!isIgnored(filterStr)) {
				  strBuf.append(filterStr);
			  }
		  }
		  return strBuf.toString();
	  }
	  
	  /**
	   * 获取所有可能的组合
	   * @param digits
	   * @return ArrayList<String>
	   */
	  default ArrayList<String> letterCombinations(String digits) {

		  ArrayList<String> result = new ArrayList<String>();
		  
		  digits=digitsFilter(digits);
		  
	      if("".equals(digits)||digits==null) {
	    	  return result;
	      }
	      
	      Map<String, String>  letterMap=getLetterMap();
	      findCombination(digits, 0, "",letterMap,result);
	      return result;
	  }


	
}
