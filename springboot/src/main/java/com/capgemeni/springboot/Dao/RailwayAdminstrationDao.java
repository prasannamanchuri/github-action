package com.capgemeni.springboot.Dao;

import java.util.List;

import com.capgemeni.springboot.Entity.Userinfo;

public interface RailwayAdminstrationDao {
	
	public Userinfo login(int accountId,double balance);
	public Userinfo register(int accountId,double balance);
	public List<Userinfo> getBalance(int UserId);
	

}
