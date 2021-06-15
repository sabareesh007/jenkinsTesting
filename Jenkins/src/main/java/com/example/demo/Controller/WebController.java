package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@PostMapping(value = "/helloWorld", produces = "application/json")
	public ResponseEntity<SampleResponse> Sample() {
		HttpStatus status = HttpStatus.OK;
		SampleResponse response = new SampleResponse();
		response.setMessage("Hello From Jenkins");		
		return new ResponseEntity<>(response, status);

	}

}
