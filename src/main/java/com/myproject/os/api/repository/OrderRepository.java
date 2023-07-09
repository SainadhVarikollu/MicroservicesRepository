package com.myproject.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.os.api.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

	
}
