package com.test;

import java.io.InputStream;
import java.util.Properties;

import com.sp.ds.spring.beans.factory.config.EncryptedPropertyPlaceholderConfigurer;


public class Decrypt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*String enc = "$-5ca184358e719cb5c69e40a4d4f328a9";
		
		String[] arguments = { "-d", enc };
		EncryptedPropertyPlaceholderConfigurer crypto = new EncryptedPropertyPlaceholderConfigurer();
		String temp = enc.substring(1);
		String dec = crypto.decode(temp);
		System.out.println(dec);
		
		String test = "SCHEMA=ICMADMIN;JDBCURL=jdbc:db2://10.163.170.55:50000/icmnlsdb";
		System.out.println(test.substring(test.lastIndexOf('/')+1));*/
		
		Properties prop = new Properties();
		InputStream is = Decrypt.class.getResourceAsStream("terminateuserexit.properties");
		prop.load(is);
		
		String[] str = prop.getProperty("queries").split(",");
		System.out.println(str.length);
		
		for(String s : str){
			System.out.println("--"+s);
			System.out.println(prop.getProperty("query1"));
		}
		
		
		
		
	}

}
