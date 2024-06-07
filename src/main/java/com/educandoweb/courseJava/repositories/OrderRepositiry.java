package com.educandoweb.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJava.entities.Order;

public interface OrderRepositiry extends JpaRepository<Order, Long>{
	
}
