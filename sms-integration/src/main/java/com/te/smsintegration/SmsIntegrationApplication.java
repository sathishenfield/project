package com.te.smsintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.te.smsintegration.config.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SmsIntegrationApplication {
	
	
	@Autowired
	private TwilioConfig twilioConfig;

	@PostConstruct
	public void initTwilio(){
		Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(SmsIntegrationApplication.class, args);
	}

}
