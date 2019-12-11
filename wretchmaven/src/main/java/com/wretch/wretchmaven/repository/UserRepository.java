package com.wretch.wretchmaven.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wretch.wretchmaven.model.User;

@Service
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByUsername(String username);

}
