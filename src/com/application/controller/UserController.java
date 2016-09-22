package com.application.controller;

import java.util.List;  

import javax.ws.rs.DELETE;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  

import com.application.bean.User;
import com.application.service.UserService;

@Path("/users")
public class UserController {
	
	UserService userservice = new UserService();
	@GET  
    @Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		List<User> listofUsers = userservice.getAllUsers();
		return listofUsers;
	}
	
	 @GET  
	 @Path("/{emailid}")  
	 @Produces(MediaType.APPLICATION_JSON)  
	 public User getUserByEmail(@PathParam("emailid") String emailid){
		 return userservice.getUser(emailid);
	 }
	 @GET  
	 @Path("/hello")  
	 @Produces(MediaType.APPLICATION_JSON)  
	 public String hello(){
		 return "Hello World";
	 }
	 
	 @POST  
	 @Produces(MediaType.APPLICATION_JSON)
	 public User addUser(User user){
		 return userservice.addUser(user);
	 }
	 
	 @PUT  
	 @Produces(MediaType.APPLICATION_JSON) 
	 public User updateUser(User user){
		 return userservice.updateUser(user);
	 }
	 
	 @DELETE  
	 @Path("/{emailid}")  
	 @Produces(MediaType.APPLICATION_JSON)
	 public void deleteUser(@PathParam("emailid") String emailid){
		 userservice.deleteUser(emailid);
	 }
}
