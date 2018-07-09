package com.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileRead {
	
	public static void main(String[] args) {
		try{
			Properties prop = new Properties();
	        String dir = "D:/IWF/ConfigFiles/CaseEnquiry/";
	        InputStream in = new FileInputStream(dir+"/application.properties");
	        prop.load(in);
	        in.close();
	        
	        System.out.println(prop.get("targets"));
	        
		} catch(Exception e){
			
		}
	}

}
