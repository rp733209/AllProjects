package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDaoImpl;

	@Override
	public void savaData(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.savaData(employee);

	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAllData();
	}

}
