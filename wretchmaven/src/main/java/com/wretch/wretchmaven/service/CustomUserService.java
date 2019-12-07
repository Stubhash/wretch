package com.wretch.wretchmaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.wretch.wretchmaven.model.User;
import com.wretch.wretchmaven.repository.UserRepository;



@Service
public class CustomUserService {
	 @Autowired
	    private UserRepository userRepository;
	  
	    @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	    
	    public void save(User user) {
	        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	       
	        userRepository.save(user);
	    }

	    public User findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }
}
