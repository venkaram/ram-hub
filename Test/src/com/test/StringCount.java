package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringCount {
	
	public static void main(String[] args) {
		Map<String, Integer> characterMap = new HashMap<String, Integer>();
		
		String str = "Welcome to test leaf";
		
		char[] charArray = str.toCharArray();
		
		for(char c : charArray){
			if(c != ' '){
				if(characterMap.containsKey(String.valueOf(c).toUpperCase())){
					int count = characterMap.get(String.valueOf(c).toUpperCase());
					count++;
					characterMap.put(String.valueOf(c).toUpperCase(), count);
				} else {
					characterMap.put(String.valueOf(c).toUpperCase(), 1);
				}
			}
		}
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(characterMap);
		System.out.println(treeMap.toString());
	}

}
