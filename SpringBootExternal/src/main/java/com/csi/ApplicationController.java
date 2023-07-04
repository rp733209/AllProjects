package com.csi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
l
@RestController
@RequestMapping("/")

public class ApplicationController {

	@GetMapping(value = "/api")
	public ResponseEntity<String> sayWelcome() {
		return ResponseEntity.ok("Welcome To Fintech And Pay fees");
	}

	@GetMapping(value = "/salary")
	public ResponseEntity<Double> saySalary() {
		return ResponseEntity.ok(650000.22);

	}

}
