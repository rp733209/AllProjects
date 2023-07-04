package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void signUp(Employee employee);

    public boolean signIn(String empEmailId, String empPassword);

    public Employee getDataById(long empId);

    public List<Employee> getDataByName(String empName);

    public List<Employee> sorBySalary();

    public Employee getDataByContactNumber(long empContactNumber);

    public List<Employee> getAllData();

    public void updateData(long empId, Employee employee);

    public void deleteDataById(long empId);

    public void deleteAllData();

}
