package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void savaData(Employee employee);

    public List<Employee> getAllData();
}
