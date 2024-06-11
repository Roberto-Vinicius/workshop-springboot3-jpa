package com.educandoweb.courseJava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseJava.entities.Product;
import com.educandoweb.courseJava.repositories.ProductRepositiry;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositiry repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}