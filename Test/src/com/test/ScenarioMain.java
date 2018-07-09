package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ScenarioMain {

	public static void main(String[] args) throws Exception {
		
		Map<String, Map<String, String>> map = new HashMap<String, Map<String,String>>();
		Map<String, String> innerMap = null;
		List<ScenarioBean> beanList = new ArrayList<ScenarioBean>();
		
		File file = new File("C:\\Users\\Admin\\Documents\\scenario.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow headerRow = sheet.getRow(0);
		int columnCount = headerRow.getLastCellNum();
		int rowCount = sheet.getLastRowNum();
		
		String[] headers = new String[columnCount];
		
		for(int i = 0; i < columnCount; i++){
			headers[i] = headerRow.getCell(i).getStringCellValue();
		}
		System.out.println(rowCount);
		
		for(int i = 1; i <= rowCount; i++){
			XSSFRow row = sheet.getRow(i);
			String scenarioName = row.getCell(0).getStringCellValue();
			innerMap = new HashMap<String, String>();
			/*String creditCardNumber = row.getCell(1).getStringCellValue();
			String trackingId = row.getCell(2).getStringCellValue();
			String phoneNumber = row.getCell(3).getStringCellValue();
			ScenarioBean bean = new ScenarioBean();
			bean.setCreditCardNumber(creditCardNumber);
			bean.setTrackingId(trackingId);
			bean.setPhoneNumber(phoneNumber);
			
			beanList.add(bean);*/
			for(int j = 1; j < columnCount; j++){
				innerMap.put(headers[j], row.getCell(j).getStringCellValue());
			}
			map.put(scenarioName, innerMap);
		}
		System.out.println(map.toString());
		fis.close();
	}

}
