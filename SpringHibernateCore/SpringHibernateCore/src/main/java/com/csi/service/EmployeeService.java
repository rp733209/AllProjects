package com.csi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csi.model.Employee;
public interface EmployeeService {
	public void savaData(Employee employee);

	public List<Employee> getAllData();
}
