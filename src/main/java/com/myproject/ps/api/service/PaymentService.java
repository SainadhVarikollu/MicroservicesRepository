package com.myproject.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.ps.api.entity.Payment;
import com.myproject.ps.api.paymentrepository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repo;
	
	
	public Payment savePayment(Payment payment) {
		payment.setPaymnetStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString()) ;
		
		return repo.save(payment);
	}
	
public String paymentProcessing() {
		
		//API should be thirdparty gateway
		
		return new Random().nextBoolean() ? "Success" :  "false";
	}

}
