package com.philip.repository;

import org.springframework.data.repository.CrudRepository;

import com.philip.model.User;

public interface UserRepository extends CrudRepository<User, String>{

	User locateSuccessByName(String name);

}
