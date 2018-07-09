package com.test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlTags {
	
	public static void main(String[] args) {
		try{
			String[] type = {"num","tat"};
			String[] submissionType = {"Ez","Ip","Ma"};
			String[] caseCat = {"Ftc","Ftu","Nmc","Nmu","Mc","Mu"};
			String[] slaBand = {"Within","Near","Over"};
			
			StringBuilder stringBuilder = new StringBuilder();
			int count=0;
			for(int i = 0; i < type.length; i++){
				for(int j = 0; j < submissionType.length; j++){
					for(int k=0;k<caseCat.length;k++){
						for(int l=0;l<slaBand.length;l++){
							System.out.println(type[i]+submissionType[j]+caseCat[k]+slaBand[l]);
							
							String s = type[i]+submissionType[j]+caseCat[k]+slaBand[l];
							stringBuilder.append("<variable-element name=\""+s+"\"><expression name=\"value\" type=\"javascript\">0</expression><property name=\"type\">report</property></variable-element>");
							
						}
					}
				}
			}
			System.out.println(stringBuilder);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
