package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
	
	
	public static void main(String[] args) {
		System.out.println("test");
		
		String str = "'_APPROVECANCELLATION', '_APPROVEMEDICALDISBUSEMENT', '_AUTOSUSPEND', '_BILLINGMANAGER', '_CANCELLATION', '_CCBILLING', '_CDMANAGER', '_CREDITCARDTEAM', '_DATAENTRY', '_DATAVERIFY', '_DIRECTDEBITTEAM', '_DSMANAGER', '_EXCEPTIONTEAM', '_ISSUEQC', '_ITSECURITY', '_MED', '_MEDBILL', '_MEDICAL', '_MEDICALDISBURMENT', '_MEDREIM', '_MEDUW', '_MedDisbursement', '_NBADMIN', '_NBMANAGER', '_NONMED', '_POLICYPACK', '_READONLY', '_REOPEN', '_SENIORMED', '_SLACONFIG', '_SUPCANCELLATION', '_SUPCCTEAM', '_SUPDATAVERIFY', '_SUPDDTEAM', '_SUPERMANAGERROLE', '_SUPERVISORDE', '_SUPMD', '_SUPMEDICALDISBUSEMENT', '_SUPNONMED', '_SUPUPDTREQM', '_SUSPEND', '_TEMPCC', '_TESTSUP', '_UPDTREQM', '_UPDTREQMAPS', '_UWMANAGER', '_UWManager', '_UWQC', '_UnderWriter', '_VERIFYREOPEN', '_VERIFYREOPENREQ', '_WDQC', '_WITHDRAW'";
		str = str.replace("eq", "=").replace("ge", ">=");
		System.out.println(str);
	}
	
	/*public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Highest");
		list.add("High");
		list.add("Lowest");
		list.add("Low");
		
		System.out.println("List before sort :");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("List after sort :");
		System.out.println(list);
	}*/
	
	

}
