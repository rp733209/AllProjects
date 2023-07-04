package com.csi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping("/welcome")
	public ResponseEntity<String> sayWelcome() {

		return ResponseEntity.ok("Welcome To INFOSYS");

	}

	@GetMapping("/phonenumber")
	public ResponseEntity<Long> phoneNumber() {
		return ResponseEntity.ok(9623587425L);

	}
}
