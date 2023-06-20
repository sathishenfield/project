package com.te.smsintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.smsintegration.config.TwilioConfig;
import com.te.smsintegration.dto.NumberDTO;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioService {
	@Autowired
	private TwilioConfig twilioConfig;

//	public Boolean sendSMS(NumberDTO numberDTO) {
//
//		try {
//			PhoneNumber to = new PhoneNumber(numberDTO.getMobNO());
//			PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
//
//			Message message = Message.creator(to, from, "Hi").create();
//			return true;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return false;
//		}
//
//	}
//	
	public Boolean sendSMS(String mobNo) {

		try {
			PhoneNumber to = new PhoneNumber("+91 "+mobNo);
			PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());

			Message message = Message.creator(to, from, "Hi").create();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
}
