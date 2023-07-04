package com.csi.controller;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;
    @PostMapping("/savedata")
    public ResponseEntity<String> signUp(@RequestBody Employee employee){
        employeeServiceImpl.signUp(employee);
        return ResponseEntity.ok("Data Saved Succesfully");

    }
    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataBYId(@PathVariable int empId){
        //if (employeeServiceImpl.getDataById(empId)==empId) {
            return ResponseEntity.ok(Optional.ofNullable(employeeServiceImpl.getDataById(empId).orElseThrow(() -> new RecordNotFoundException("ID Does Not Exist"))));
        }
      //

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }
    @DeleteMapping("/deletebyid/{empId}")
    public  ResponseEntity<String> deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return ResponseEntity.ok("Delete Data Succesfully");
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<String> updateData(@PathVariable int empId,@RequestBody Employee employee){
        Employee employee1=employeeServiceImpl.getDataById(empId).orElseThrow(()-> new RecordNotFoundException("ID Does Not Exist"));
        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpAddress(employee.getEmpAddress());
        employee1.setEmpDOB(employee.getEmpDOB());
        employeeServiceImpl.updateData(empId,employee1);
        return ResponseEntity.ok("Data Updated Succesfully");
    }
}
