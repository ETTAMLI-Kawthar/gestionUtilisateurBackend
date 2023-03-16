package com.nadhem.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.admin.entities.User;
import com.nadhem.admin.repos.UserRepository;

@Service
public class UserServiceimp implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		User userExist = getUserById(user.getidUser());
		userExist.setfirstNameUser(user.getfirstNameUser());
		userExist.setlastNameUser(user.getlastNameUser());
		userExist.setemailUser(user.getemailUser());
		userExist.setpasswordUser(user.getpasswordUser());
		return userRepository.save(userExist);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
