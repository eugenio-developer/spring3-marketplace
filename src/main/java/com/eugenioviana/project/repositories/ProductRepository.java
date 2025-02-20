package com.eugenioviana.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenioviana.project.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
