package com.gendronPortfolio.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.gendronPortfolio.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
	
}
