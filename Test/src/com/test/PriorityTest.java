package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class PriorityTest {
	
	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		int rowCount = 0;
		Map<String, List<CustomObject>> map = new HashMap<String, List<CustomObject>>();
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "postgres", "password");
	         
	         stmt = c.createStatement();
	         /*String query = "select indexclassname, tbr.rolename, privilegesetname, allowed " +
	 				"from dscm.tbl_indexclass ic inner join dscm.tbl_acessmemberadd ama on ic.aclid=ama.aclid " + 
	 				"inner join dscm.tbl_acesscontrolentry ace on ace.aceid=ama.aceid " + 
	 				"inner join dscm.tbl_privilegesetmaster pvm on ace.privilegesetid=pvm.privilegesetid " + 
	 				"inner join dscm.tbl_role tbr on tbr.roleid=ace.roleid where indexclassname in ('LooseMails','MedicalRecords') " +
	 				"order by 1, 2, 3";*/
	         ResultSet rs = stmt.executeQuery( "select * from localtest.application_field_values" );
	         
	         while(rs.next()){
	        	 rowCount++;
	        	 System.out.println(rs.getString("app_num"));
	         }
	         System.out.println(rowCount);
	         System.out.println(StringUtils.capitalize("HIGH"));
	         //ResultSet rs = stmt.executeQuery(query);
	         /*
	         List<CustomObject> tempList = null;
	         while(rs.next()){
	        	 String str = rs.getString(1);
	        	 CustomObject obj = new CustomObject();
        		 obj.setRoleName(rs.getString(2));
        		 obj.setPrivilegeName(rs.getString(3));
        		 obj.setPrivilege(String.valueOf(rs.getBoolean(4)));
	        	 if(map.containsKey(str)){
	        		 tempList = map.get(str);
	        		 tempList.add(obj);
	        		 map.put(str, tempList);
	        	 } else {
	        		 tempList = new ArrayList<CustomObject>();
	        		 tempList.add(obj);
	        		 map.put(str, tempList);
	        	 }
	         }
	         
	         Map<String, List<CustomObject>> updatedMap = new HashMap<String, List<CustomObject>>();
	         
	         Set<String> keys = map.keySet();
	         
	         for(String key : keys){
	        	 List<CustomObject> objList = map.get(key);
	        	 String check = objList.get(0).getRoleName();
	        	 for(CustomObject obj : objList){
	        		 if(check.equals(obj.getRoleName())){
	        			 if("TRUE".equalsIgnoreCase(obj.getPrivilege())){
	        				 
	        			 }
	        		 }
	        	 }
	         }*/
	         
	         System.out.println(map.toString());
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      } finally{
	    	  try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      System.out.println("Opened database successfully");

	}

}
