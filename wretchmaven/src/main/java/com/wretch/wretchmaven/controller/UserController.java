package com.wretch.wretchmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wretch.wretchmaven.model.User;
import com.wretch.wretchmaven.repository.UserRepository;


@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;

	@Autowired

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

	@RequestMapping(method = RequestMethod.POST, value="/rating")
	public void Ratingpoints(User user, String points) {
		 String partner =  user.getTradingpartner();
		 User trading = userRepo.findByUsername(partner);
		  trading.setPoints(trading.getPoints()+points);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/newUser")
	private ResponseEntity<Integer> newUser(@RequestBody User newUser) {
		
		
		if (newUser.getUsername().matches("[\\w- ]+") && newUser.getUsername().length() >= 5  && checkUser(newUser)) {
			if (newUser.getPassword().equals(newUser.getPasswordConfirm()) && newUser.getPassword().length() >= 5) {
				User user = new User();
				user.setUsername(newUser.getUsername());
				user.setPassword(passwordEncoder.encode(newUser.getPassword()));
				user.setPasswordConfirm(newUser.getPasswordConfirm());
				user.setEnabled(true);
				user.setEmail(newUser.getEmail());
				user.setCity(newUser.getCity());
				user.setCountry(newUser.getCountry());
				user.setGender(newUser.getGender());
				user.setHouseNr(newUser.getHouseNr());
				user.setLastname(newUser.getLastname());
				user.setName(newUser.getName());
				user.setStreet(newUser.getStreet());
				user.setZipcode(newUser.getZipcode());
				userRepo.save(user);
			} else {
				return ResponseEntity.badRequest().body(0);
			}
		} else {
			return ResponseEntity.badRequest().body(0);
		}
		return ResponseEntity.ok().body(1);
	}

    @RequestMapping(method = RequestMethod.POST, value = "/setPartner")
    private void setPartner(User user) {
        Iterable<User> allUsers = userRepo.findAll();
        User user2 = allUsers.iterator().next();
        if(user.getUsername() != user2.getUsername()) {
        user.setTradingpartner(user2.getUsername());
        user2.setTradingpartner(user.getUsername());
    }
        else {
        	 user2 = allUsers.iterator().next();
        	 user.setTradingpartner(user2.getUsername());
             user2.setTradingpartner(user.getUsername());
        }
        
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getScore")
    private ResponseEntity getScore() {
    	
        return ResponseEntity.ok().body(userRepo.findAll());
    }
    
    private boolean checkUser(User user) {
    	 Iterable<User> allUsers = userRepo.findAll();
    	 for (User user2 : allUsers) {
			if(user2.getUsername() == user.getUsername()) {
				return false;
			}
		}
    	return true;
    	
    }
}
