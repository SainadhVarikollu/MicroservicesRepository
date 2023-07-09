package com.myproject.ps.api.paymentrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.ps.api.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
