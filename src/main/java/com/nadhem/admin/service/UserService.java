package com.nadhem.admin.service;

import java.util.List;

import com.nadhem.admin.entities.User;

public interface UserService {
	User saveUser(User p);

	User updateUser(User p);

	void deleteUser(Long id);

	User getUserById(Long id);

	List<User> getAllUser();

}
