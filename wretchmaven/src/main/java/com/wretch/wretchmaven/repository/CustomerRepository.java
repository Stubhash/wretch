package com.wretch.wretchmaven.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wretch.wretchmaven.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, String> {

Optional<Customers> findByName(String username);

}
