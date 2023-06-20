package com.te.smsintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.smsintegration.dto.NumberDTO;
import com.te.smsintegration.service.TwilioService;

@RestController
public class TwilioController {
	
	@Autowired
	private TwilioService twilioService;
	
//	@PostMapping("/send")
//	public ResponseEntity<?> sendSMS(@RequestBody NumberDTO mobNo){
//		Boolean sendSMS = twilioService.sendSMS(mobNo);
//		if (sendSMS) {
//			return new ResponseEntity<String>("SMS sent",HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<String>("SMS not sent",HttpStatus.BAD_GATEWAY);
//		}
//		
//	}
	
	@GetMapping("/send")
	public ResponseEntity<?> sendSMS(@RequestParam String mobNo){
		Boolean sendSMS = twilioService.sendSMS(mobNo);
		if (sendSMS) {
			return new ResponseEntity<String>("SMS sent",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("SMS not sent",HttpStatus.BAD_GATEWAY);
		}
		
	}

}
