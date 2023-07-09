package com.myproject.os.api.common;

import com.myproject.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

	
	private Order order;
	private Double amount;
	private String TransactionId;
	private String message;

	public TransactionResponse(Order order2, Double amount2, String transactionId2, String response) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amount=" + amount + ", TransactionId=" + TransactionId
				+ ", message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	
}
