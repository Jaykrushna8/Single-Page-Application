package com.application.service;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  

import com.application.bean.User;
import com.application.exception.UserNotFoundException;
public class UserService {
	static HashMap<String, User> UserMap = getUserMap();
	
	public UserService(){
		super();
		if(UserMap == null){
			UserMap = new HashMap<String, User>();
			// creating some object of users while initializing
			User jayUser = new User("jay@gmail.com","Jay","Patel","jay123",2134567894,"pizza");
			User jkUser = new User("jk@gmail.com","Jk","Patel","jk123",2124567894,"cookies");
			User architUser = new User("archit@gmail.com","Archit","Trivedi","archit123",1134567894,"cake");
			User pcUser = new User("prashant@gmail.com","Prashant","Patel","pc123",1134657894,"taco");
			User chirayuUser = new User("chirayu@gmail.com","Chirayu","Shah","chirayu123",1134576894,"cake");
			
			UserMap.put("jay@gmail.com", jayUser);
			UserMap.put("jk@gmail.com", jkUser);
			UserMap.put("archit@gmail.com", architUser);
			UserMap.put("prashant@gmail.com", pcUser);
			UserMap.put("chirayu@gmail.com", chirayuUser);
		}
	}
	public List<User> getAllUsers(){
		List<User> users= new ArrayList<User>(UserMap.values());
		return users;
	}
	
	public User getUser(String emailid){
		User user = UserMap.get(emailid);
		if(user == null){
			throw new UserNotFoundException("User with email address"+ emailid + "not found");
		}
		return user;
	}
	
	public User addUser(User user){
		
		UserMap.put(user.getEmailid(), user);
		return user;
	}
	
	public User updateUser(User user){
		UserMap.put(user.getEmailid(), user);
		return user;
	}
	public void deleteUser(String emailid){
		UserMap.remove(emailid);
	}
	public static HashMap<String, User> getUserMap(){
		return UserMap;
	}
	
	
}
