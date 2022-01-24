package com.capgemeni.springboot.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemeni.springboot.Dao.com.capgemeni.springboot.Dao.RailwayAdminstrationDao;
import com.capgemeni.springboot.Entity.Userinfo;
import com.capgemeni.springboot.Repository.BankAccountRepository;

public class RailwayAdminstrationDaoImpl implements RailwayAdminstrationDao {

	@Autowired
	RailwayAdminstrationRepository railwayadminstrationRepo;
	
	@Override
	public Userinfo login(String Username,String Password) {
		List<Userinfo> userDetails = railwayadminstrationRepo.findByUserName&&Password(UserName,Password);
		if(userDetails.size()>0) {
			Userinfo userdetailsValues = userdetails.get(0);
			if (userdetailsValues.getUsertype()=="user" ){
				
				return bankAccountRepo.save(bankAccountValues);
			}
			else return null;
		}
		else
			return null;
	}

	@Override
	public Userinfo deposit(int accountId, double depositBalance) {
		List<Userinfo> bankDetails = bankAccountRepo.findByaccountId(accountId);
		if(bankDetails.size()>0) {
			Userinfo bankAccountValues = bankDetails.get(0);
			bankAccountValues.setAccountBalance(depositBalance+bankAccountValues.getAccountBalance());
			return bankAccountRepo.save(bankAccountValues);
		}
		else
			return null;
	}

	@Override
	public List<Userinfo> getBalance(int accountId) {
		return bankAccountRepo.findByaccountId(accountId);
	}

	@Override
	public boolean fundTransfer(int fromaccountId, int toaccountId, double transferAmount) {
		List<Userinfo> bankDetails = bankAccountRepo.findByaccountId(fromaccountId);
		if(bankDetails.size()>0) {
			Userinfo from_bankAccountValues = bankDetails.get(0);
			if(from_bankAccountValues.getAccountBalance()>transferAmount) {
				Userinfo fromBankAccount=withdraw(fromaccountId, transferAmount);
				if(fromBankAccount!=null) {
					Userinfo toBankAccount=deposit(toaccountId, transferAmount);
					if(toBankAccount!=null)
						return true;
					else
						return false;
				} else return false;
			}
			else return false;
		}
		else
			return false;
	}

}
