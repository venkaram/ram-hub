package com.test;

import java.io.File;

public class TestIni {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("D:\\PACS\\ICMOperations\\Files\\cmbicmenv.ini");
		//File file = new File("D:\\PACS\\ICMOperations\\Files\\test.txt");
		System.out.println(file.exists());
	}

}
