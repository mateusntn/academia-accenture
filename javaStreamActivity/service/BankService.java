package service;

import java.util.List;

import entities.Account;
import entities.Client;

public interface BankService {
	public List<Account> listAccounts();
	public List<Client> listClients();
}
