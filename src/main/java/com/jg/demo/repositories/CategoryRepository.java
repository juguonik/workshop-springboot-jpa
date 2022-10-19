package com.jg.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jg.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	

}
