package com.educandoweb.courseJava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseJava.entities.Order;
import com.educandoweb.courseJava.repositories.OrderRepositiry;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositiry repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}