package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public void signUp(Employee employee);

    public boolean signIn(String empEmailId,String empPassword);

    public void updateDataById(int empId,Employee employee);

    public List<Employee> getAllData();

    public Employee getDataById(int empId);

    public void deleteDataById(int empId);

    public void deleteAllData();


}
