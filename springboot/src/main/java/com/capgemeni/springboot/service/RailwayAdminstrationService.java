package com.capgemeni.springboot.service;

public interface RailwayAdminstrationService {
	public double login(String Username,String Password);
	public double register(String Username,String Password);
	public double getuserlist(String userId);
	
}
