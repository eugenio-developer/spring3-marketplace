package com.eugenioviana.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenioviana.project.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
