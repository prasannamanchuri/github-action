package com.capgemeni.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemeni.springboot.DaoImpl.RailwayAdminstrationDaoImpl;
import com.capgemeni.springboot.Entity.Userinfo;
import com.capgemeni.springboot.service.BankAccountService;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	RailwayAdminstrationDaoImpl bankAccountDaoImpl;
	
	@Override
	public double withdraw(int accountId, double withdrawAmount) {
		Userinfo bankAccountDetails=bankAccountDaoImpl.withdraw(accountId,withdrawAmount);
		if(bankAccountDetails!=null) {
			return bankAccountDetails.getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public double deposit(int accountId, double depositBalance) {
		Userinfo bankAccountDetails=bankAccountDaoImpl.deposit(accountId,depositBalance);
		if(bankAccountDetails!=null) {
			return bankAccountDetails.getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public double getBalance(int accountId) {
		List<Userinfo> bankAccountDetails=bankAccountDaoImpl.getBalance(accountId);
		if(bankAccountDetails.size()>0) {
			return bankAccountDetails.get(0).getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public boolean fundTransfer(int fromaccountId, int toaccountId, double amount) {
		return bankAccountDaoImpl.fundTransfer(fromaccountId, toaccountId, amount);
	}

}
