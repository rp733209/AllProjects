package com.csi.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.csi.model.Employee;


public interface EmployeeDao {
	public void savaData(Employee employee);

	public List<Employee> getAllData();

}
