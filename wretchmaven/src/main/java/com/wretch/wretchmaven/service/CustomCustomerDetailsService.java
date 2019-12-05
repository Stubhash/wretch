package com.wretch.wretchmaven.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wretch.wretchmaven.model.CustomCustomerDetails;
import com.wretch.wretchmaven.model.Customers;
import com.wretch.wretchmaven.repository.CustomerRepository;

@Service
public class CustomCustomerDetailsService implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Customers> optionalcustomers = customerRepository.findByName(username);
		optionalcustomers.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
		
		
		return optionalcustomers.
				map(CustomCustomerDetails::new).get();
	}

}
