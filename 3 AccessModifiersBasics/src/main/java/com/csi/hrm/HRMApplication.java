package com.csi.hrm;

import com.csi.constant.HRMCostant;
import com.csi.core.Customer;

public class HRMApplication extends Customer {

	public static void main(String[] args) {
		
		HRMApplication application = new HRMApplication();
		
		System.out.println(application.custName);
		System.out.println(
				"\n Employee Name: " + HRMCostant.EMPLOYEE_NAME + "\n Company Name: " + HRMCostant.COMPANY_NAME);
	}

}
