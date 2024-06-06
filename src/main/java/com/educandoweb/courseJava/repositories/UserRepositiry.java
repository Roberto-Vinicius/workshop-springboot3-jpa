package com.educandoweb.courseJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJava.entities.User;

public interface UserRepositiry extends JpaRepository<User, Long>{
	
	
}
