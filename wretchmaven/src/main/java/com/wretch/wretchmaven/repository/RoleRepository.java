package com.wretch.wretchmaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wretch.wretchmaven.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}