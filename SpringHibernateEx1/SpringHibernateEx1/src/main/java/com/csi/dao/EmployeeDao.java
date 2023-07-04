package com.csi.dao;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeDao {
    public void savaData(Employee employee);

    public List<Employee> getAllData();
}
