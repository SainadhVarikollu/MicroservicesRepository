package com.myproject.os.api.common;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	
	private int paymentId;	
	
	private String paymnetStatus;

	private String transactionId;
	
	private int orderId;
	private Double amount;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
      
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymnetStatus() {
		return paymnetStatus;
	}
	public void setPaymnetStatus(String paymnetStatus) {
		this.paymnetStatus = paymnetStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	

	
	
	

}
