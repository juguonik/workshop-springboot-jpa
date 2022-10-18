package com.jg.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jg.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	

}
