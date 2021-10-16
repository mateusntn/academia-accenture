package service;

public class ServiceFactory {

	public static BankService getService() {
		return new BankServiceImpl();
	}
}
