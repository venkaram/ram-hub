package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SortArray {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Highest");
		list.add("High");
		list.add("Lowest");
		list.add("Low");
		
		/*System.out.println("List before sort :");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("List after sort :");
		System.out.println(list);*/
		
		String joinedStr = StringUtils.join(list, ",");
		System.out.println(list.toString());
		System.out.println(joinedStr);

	}

}
