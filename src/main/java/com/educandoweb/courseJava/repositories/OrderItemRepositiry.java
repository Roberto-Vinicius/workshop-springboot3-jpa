package com.educandoweb.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJava.entities.OrderItem;
import com.educandoweb.courseJava.entities.pk.OrderItemPK;

public interface OrderItemRepositiry extends JpaRepository<OrderItem, OrderItemPK>{
	
}
