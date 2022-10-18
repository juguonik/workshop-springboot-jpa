package com.jg.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jg.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
