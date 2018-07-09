package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) throws Exception {
			
		Date temp = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		/*String parsedDate = dateFormat.format(temp);
		System.out.println(parsedDate);*/
		
		SimpleDateFormat date2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		/*System.out.println(date2.format(temp));
		String s = date2.format(temp);
		
		Date d3 = date2.parse(s);
		System.out.println(d3);*/
		Date d = null;
		//String test = "2018-01-18 21:15:01.932";
		String test = "2018-02-22 01:55:34.855262";
		if(test.length() > 22){
			test = test.substring(0, 22);
			System.out.println("---"+test);
		}
		//String test = "2018-02-22 01:55:34.855";
		System.out.println(test.length());
		
		if(test.length() == 16){
			d = dateFormat1.parse(test);
		} else {
			d = dateFormat.parse(test);
		}
		
		//Date d = dateFormat1.parse(test);
		
		//Date test1 = date2.parse(test);
		System.out.println(d);
		System.out.println(dateFormat1.format(d));
		
	}

}
