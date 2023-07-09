package com.myproject.ps.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Payment_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;	
	
	@Column(name="paymnetStatus")
	private String paymnetStatus;
	
	@Column(name="transactionId")
	private String transactionId;
	
	@Column(name="orderId")
	private int orderId;
	
	@Column(name="amount")
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
