package com.wretch.wretchmaven.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.wretch.wretchmaven.model.User;
import com.wretch.wretchmaven.repository.UserRepository;

@Service("userDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        } else {
            return new SpringSecurityUser(user);
        }
    }}

