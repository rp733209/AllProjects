package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public void signUp(Employee employee){
        employeeDaoImpl.signUp(employee);
    }
    public Optional<Employee> getDataById(int empId){
        return employeeDaoImpl.getDataById(empId);
    }
    public List<Employee> getAllData(){
        return employeeDaoImpl.getAllData();
    }
    public void deleteDataById(int empId){
        employeeDaoImpl.deleteDataById(empId);
    }
    public Employee updateData(int empId,Employee employee){
        return employeeDaoImpl.updateData(empId,employee);
    }
}
