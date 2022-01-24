package com.capgemeni.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemeni.springboot.serviceImpl.BankAccountServiceImpl;

@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountServiceImpl bankAccountService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public @ResponseBody String check() {
		return "BankAccount Application started";
	}
	
	@RequestMapping(value="/withdraw",method=RequestMethod.POST)
	public @ResponseBody double withdraw(@RequestParam("accountId") int accountId, @RequestParam("accountBalance") double accountBalance) {
		return bankAccountService.withdraw(accountId, accountBalance);
	}

	@RequestMapping(value="/deposit",method=RequestMethod.POST)
	public @ResponseBody double deposit(@RequestParam("accountId") int accountId, @RequestParam("accountBalance") double accountBalance) {
		return bankAccountService.deposit(accountId, accountBalance);
	}

	@RequestMapping(value="/getBalance",method=RequestMethod.POST)
	public @ResponseBody double getBalance(@RequestParam("accountId") int accountId) {
		return bankAccountService.getBalance(accountId);
	}

	@RequestMapping(value="/fundTransfer",method=RequestMethod.POST)
	public @ResponseBody boolean fundTransfer(@RequestParam("fromaccountId") int fromaccountId, @RequestParam("toaccountId") int toaccountId,@RequestParam("amount") double amount) {
		return bankAccountService.fundTransfer(fromaccountId, toaccountId, amount);
	}

}
