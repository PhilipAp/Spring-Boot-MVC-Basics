package com.philip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philip.model.User;
import com.philip.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	/*public User registerSuccess() {
		return userRepository.locateSuccessByName("name");
		
	}*/

}
