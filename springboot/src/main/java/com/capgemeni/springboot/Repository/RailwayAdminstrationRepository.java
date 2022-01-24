package com.capgemeni.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemeni.springboot.Entity.Userinfo;

public interface RailwayAdminstrationRepository extends MongoRepository<Userinfo, Integer>{
	public List<Userinfo> findByUserId(int UserId);
	
	@Modifying
	@Query("update bankaccount set accountbalance=:accountBalance where accountId=:accountId")
	public void updateBalance(@Param("accountId") int accountId,@Param("accountBalance") double accountBalance);
}
