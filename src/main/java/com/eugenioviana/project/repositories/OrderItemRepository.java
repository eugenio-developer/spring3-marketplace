package com.eugenioviana.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eugenioviana.project.entities.OrderItem;
import com.eugenioviana.project.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
