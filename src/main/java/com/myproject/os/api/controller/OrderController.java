package com.myproject.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.os.api.common.Payment;
import com.myproject.os.api.common.TransactionRequest;
import com.myproject.os.api.common.TransactionResponse;
import com.myproject.os.api.entity.Order;
import com.myproject.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionrequest) {
		    
		
		
		
		   return orderService.saveOrder(transactionrequest);
		   
		   //Do a rest call to payment by sending the orderId
		
	
	
	
}
	
}
