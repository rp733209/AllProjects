package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public void signUp(Employee employee){
        employeeRepo.save(employee);
    }
    public Optional<Employee> getDataById(int empId){
       return employeeRepo.findById(empId);
    }
    public List<Employee> getAllData(){
        return employeeRepo.findAll();
    }
    public void deleteDataById(int empId){
        employeeRepo.deleteById(empId);
    }
    public Employee updateData(int empId,Employee employee){
      return employeeRepo.save(employee);
    }
}
