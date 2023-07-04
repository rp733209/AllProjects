package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {
    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/adddata")

    public ResponseEntity<String> saveData(@RequestBody Employee employee){
        employeeServiceImpl.savaData(employee);
        return ResponseEntity.ok("Data Saved Succesfully");


    }
    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

}
