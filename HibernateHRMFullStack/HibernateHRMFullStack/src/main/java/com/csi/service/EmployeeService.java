package com.csi.service;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeService {
	
	public void signUp(Employee employee);

	public boolean signIn(String empEmailId, String empPassword);

	public List<Employee> getAllData();

}
