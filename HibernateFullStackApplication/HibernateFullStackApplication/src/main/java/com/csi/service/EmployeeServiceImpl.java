package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	
	EmployeeDao employeeDaoImpl = new EmployeeDaoImpl();
	
	@Override
	public void signUp(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeDaoImpl.signUp(employee);
	}
	
	

}
