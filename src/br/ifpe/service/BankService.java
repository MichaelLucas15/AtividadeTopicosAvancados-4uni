package br.ifpe.service;

import java.util.List;
//import java.util.stream.Stream;

import br.ifpe.entities.Account;
import br.ifpe.entities.Client;

public interface BankService {
	public List<Account> listAccounts();
	public List<Client> listClients();
	
	///////////////////////////////
	//public Stream<Client> streamClient();
	//public Stream<Account> streamAccount();
}
