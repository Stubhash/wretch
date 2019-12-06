package com.wretch.wretchmaven.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wretch.wretchmaven.model.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByUsername(String username);

}
