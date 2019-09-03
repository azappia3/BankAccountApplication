package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		/*// unit testing
		 * Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "456657897", 2500);
		
		savacc1.showInfo();
		
		System.out.println("***********");
		
		chkacc1.showInfo(); */ // unit testing
		
		List<Account> accounts = new LinkedList<Account>();
	
		
		
		// Read CSV File then create new accounts based on that data
		String file = "C:\\Users\\zappi\\OneDrive\\Desktop\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("\n*********************************");
			acc.showInfo();
		}
	
	}

}
