package com.jg.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jg.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	

	

}
