package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entities.Role;
import com.exam.entities.User;
import com.exam.entities.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		User user1 = new User();
//		user1.setUserName("masum1911");
//		user1.setFirstName("Masum");
//		user1.setLastName("Patel");
//		user1.setEmail("masum@gmail.com");
//		user1.setPassword("abc");
//		user1.setPhone("1234567890");
//		user1.setProfile("default.png");
//
//		Role role1 = new Role();
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user1);
//
//		userRoleSet.add(userRole);
//
//		User createUser = userService.createUser(user1, userRoleSet);
//		System.out.println(createUser.getUserName());

	}

}
