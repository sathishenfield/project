package com.te.smsintegration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class TwilioConfig {
	
//	@Value("${twilio.accountsid}")
	private String accountSid="AC80a9b4e2a902fd084e7a7b82a165ba25";
	
//	@Value("${twilio.authtoken}")
    private String authToken="ba4f737d0d94da7dbd67d9583238b10a";
	
//	@Value("${twilio.trialnumber}")
    private String trialNumber="+13159096679";

}
