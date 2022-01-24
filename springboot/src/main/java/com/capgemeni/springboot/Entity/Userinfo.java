package com.capgemeni.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "")
public class Userinfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String Name;
	private String UserName;
	private String Password;
	private int Contact;
	private String Address ;
	private String Usertype;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		this.Contact = contact;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getUsertype() {
		return Usertype;
	}
	public void setUsertype(String usertype) {
		Usertype = usertype;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Userinfo() {}
	@Override
	public String toString() {
		return "Userinfo [userId=" + userId + ", Name=" + Name + ", UserName=" + UserName + ", Password=" + Password
				+ ", Contact=" + Contact + ", Address=" + Address + ", Usertype=" + Usertype + "]";
	}
	
	
	
	
}
