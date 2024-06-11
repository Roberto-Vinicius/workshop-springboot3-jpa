package com.educandoweb.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJava.entities.Product;

public interface ProductRepositiry extends JpaRepository<Product, Long>{
	
}
