package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeServiceImpl;

	@PostMapping("/savedata")
	public ResponseEntity<String> saveData(@RequestBody Employee employee) {
		employeeServiceImpl.saveData(employee);
		return ResponseEntity.ok("Data Saved Successfully");
	}

	@GetMapping("/getalldata")
	public ResponseEntity<List<Employee>> getAllData() {
		return ResponseEntity.ok(employeeServiceImpl.getAllData());
	}
}
