package com.nadhem.admin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.admin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
