package main;

import estore.services.interfaces.src.services.Bank;
import estore.services.interfaces.src.services.Client;
import estore.services.interfaces.src.services.Provider;
import estore.services.interfaces.src.services.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store, store, store);
		
		cl.run();

	}

}
