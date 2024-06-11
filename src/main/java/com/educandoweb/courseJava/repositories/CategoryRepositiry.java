package com.educandoweb.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJava.entities.Category;

public interface CategoryRepositiry extends JpaRepository<Category, Long>{
	
}
