package com.jg.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jg.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	

}
