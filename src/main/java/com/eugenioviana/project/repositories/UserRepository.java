package com.eugenioviana.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenioviana.project.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
