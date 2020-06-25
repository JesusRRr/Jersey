package com.rolon.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.rolon.rest.model.User;

public class UserService {
	private static List<User> users;
	private static UserService instance;
	
	private UserService() {
		users=new ArrayList<>();
	}
	
	public static UserService getInsance() {
		if(instance==null) {
			instance = new UserService();
		}
		return instance;
	}
	public static void saveUser(User user ) {
		users.add(user);
	}
	
	public static List<User> getUsers(){
		return users;
	}
}
