package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
	
	public static void main(String[] args) throws Exception {
		//String str = "test!@#$%^&*()<>?/\{}[]-_+=`,";
		/*String regex = "^[a-zA-Z0-9-_,.@ \\n ]+$";
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		//String str = "test @ 123 , . \\n";
		String str = "	";
		System.out.println("---");
		System.out.println(str);
		String pattern = "[a-zA-Z0-9.,_-@ ]+";
		//boolean match = str.matches(regex);
		//System.out.println(match);
		System.out.println(str.length());
		System.out.println(str.trim().length());*/
		
		/*String start_dt = "2017-10-12";
		String[] arr = start_dt.split("-");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Date originalToDate = formatter.parse(start_dt);
		System.out.println("original toDate : " + formatter.format(originalToDate));
		
		Calendar c = Calendar.getInstance();
        c.setTime(originalToDate);
        c.add(Calendar.DATE, 1);
        Date formattedToDate = c.getTime();
        System.out.println("formatted toDate : " + formatter.format(formattedToDate));
        formatter.format(formattedToDate).toString();*/
		
		/*String temp = "2017-11-21 00:00:00.000";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		Date parsedDate = dateFormat.parse(temp);
		System.out.println(parsedDate);
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		System.out.println(d);
		String t = dateFormat2.format(d);
		System.out.println(t);
		
		System.out.println(dateFormat.format(d));*/
		
		File file = new File("D:\\CaseDistributor_DontDelete\\lastUpdatedTime.txt");
		
		BufferedReader b = new BufferedReader(new FileReader(file));
		String readLine = "";
        while ((readLine = b.readLine()) != null && !"".equals(readLine.trim())) {
        	System.out.println(readLine.trim());
        }
        b.close();
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date d = new Date();
		System.out.println(d);
		String t = dateFormat.format(d);
		
		FileWriter writer = new FileWriter(file);
		writer.write(t);
		writer.flush();
		writer.close();
        
	}

}
