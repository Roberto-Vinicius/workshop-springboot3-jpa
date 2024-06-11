package com.educandoweb.courseJava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseJava.entities.Category;
import com.educandoweb.courseJava.repositories.CategoryRepositiry;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepositiry repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}