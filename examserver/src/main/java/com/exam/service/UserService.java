package com.exam.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entities.User;
import com.exam.entities.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	// creating user
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

		User presentUser = userRepository.findByUserName(user.getUserName());

		if (presentUser != null) {
			System.out.println("User is already exist.");
			throw new Exception("User already pressent");
		} else {
			System.out.println("---- in else----------------");
			// create user
			for (UserRole ur : userRoles) {
				System.out.println("in save role" + ur.getRole());
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			presentUser = userRepository.save(user);
		}
		return presentUser;
	}

	// get user
	public User getUser(String username) {
		return userRepository.findByUserName(username);
	}

	// delete user
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

}
