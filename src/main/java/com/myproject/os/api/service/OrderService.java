package com.myproject.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.myproject.os.api.common.Payment;
import com.myproject.os.api.common.TransactionRequest;
import com.myproject.os.api.common.TransactionResponse;
import com.myproject.os.api.entity.Order;
import com.myproject.os.api.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepos;
	
	@Autowired
	private RestTemplate template;
	
	
	public TransactionResponse saveOrder(TransactionRequest  transactionrequest) {
		
		String response="";
		
		Order order=transactionrequest.getOrder();
		Payment payment=transactionrequest.getPayment();
		payment.setOrderId(order.getOrderId());
		payment.setAmount(order.getPrice());
		//do RestCall
		
		Payment paymentResponse=template.postForObject("http://localhost:9191/payment/doPayment",payment,Payment.class);
		
		
		    response=paymentResponse.getPaymnetStatus().equals("success")? "payment Processing Successful and Order Placed"   : "there is a failure in Payment API order added to Cart";
		
		 orderRepos.save(order);
		 
		
		 return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
		 
				
	}
	
	
	
	
	
}
