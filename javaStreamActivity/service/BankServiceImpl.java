package service;

import java.util.List;

import entities.Account;
import entities.Client;
import helper.LoadEntities;

public class BankServiceImpl implements BankService {

	protected BankServiceImpl() { }
	
	@Override
	public List<Account> listAccounts() {
		return LoadEntities.ACCOUNTS;
	}

	@Override
	public List<Client> listClients() {
		return LoadEntities.CLIENTS;
	}
	
}
