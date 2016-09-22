package com.application.bean;

public class User {
	String emailid;
	String firstname;
	String lastname;
	String password;
	double contectno;
	String favfood;
	public User(){
		super();
	}
	public User(String emailid, String firstname, String lastname, String password, double contectno, String favfood){
		super();
		this.emailid = emailid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.contectno = contectno;
		this.favfood = favfood;
	}
	public String getEmailid(){
		return emailid;
	}
	public void setEmailid(String emailid){
		this.emailid = emailid;
	}
	public String getFirstname(){
		return firstname;
	}
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public String getLastname(){
		return lastname;
	}
	public void setLastname(String lastname){
		this.lastname = lastname;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public double getContactno(){
		return contectno;
	}
	public void setContactno(double contactno){
		this.contectno = contactno;
	}
	public String getFavfood(){
		return favfood;
	}
	public void setFavfood(String favfood){
		this.favfood = favfood;
	}
}
