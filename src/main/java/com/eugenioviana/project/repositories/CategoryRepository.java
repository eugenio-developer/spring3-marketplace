package com.eugenioviana.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenioviana.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
