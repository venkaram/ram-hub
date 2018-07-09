package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PostGres {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		int rowCount = 0;
		Map<String, List<CustomObject>> map = new HashMap<String, List<CustomObject>>();
		List<Integer> decisionIdList = new ArrayList<Integer>();
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://10.21.213.23:5432/DSCONFIG",
							"awpluser", "password");

			stmt = c.createStatement();
			String query = "select da.DECISIONID, da.DECISION, da.DECISIONAUDITINSERTIONTIME, da.PROCESSID, da.PROCESSINSTANCENAME, " +
					"da.TARGET, da.USERNAME, da.WORKITEM_ID, atm.templatename " +
					"from dscm.DSDECISIONAUDIT da, dscm.dsaudittemplatemaster atm " +
					"where da.processinstancename like '%2859000001%' and da.target = atm.id " +
					"and upper(atm.templatename) in ('ASSIGNTOME.VM', 'CHANGEPRIORITYAUDIT.VM', 'TERMINATE.VM', 'TRANSFERWORKITEM.VM', 'WORKITEMDECISION.VM') " +
					"order by da.DECISIONAUDITINSERTIONTIME desc";
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				int i = rs.getInt("DECISIONID");
				System.out.println(i);
				decisionIdList.add(i);
			}
			Collections.sort(decisionIdList, Collections.reverseOrder());
			System.out.println(decisionIdList);

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
