package com.sanjay;
import java.util.ArrayList;
class Banks{
	ArrayList<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account ac1) {
		accounts.add(ac1);
		System.out.println("Account added successfully");
	}

	public void removeAccount(Account ac2) {
		accounts.remove(ac2);
		System.out.println("Account removed");
	}

	public Account getAccount(String Accountnumber) {
		for (Account ac : accounts) {
			if(ac.getAccountnumber().equals(Accountnumber)) {
			return ac;
			}
		}
		return null;
	}

	public void depositAccount(String Accountnumber, int Amount) {
		Account ac = getAccount(Accountnumber);
		ac.Deposit(Amount);
	}

	public void WithdrawAccount(String Accountnumber, int Amount) {
		Account ac = getAccount(Accountnumber);
		ac.Withdraw(Amount);
	}

	public void printAccountdetails() {
		for (Account acc : accounts) {
			System.out.println(acc.AccountHolderName);
			System.out.println(acc.Accountnumber);
			System.out.println(acc.Balance);
		}
	}
}

class Account {
	String Accountnumber;
	String AccountHolderName;
	int Balance;

	public Account(String AccountHolderName, String Accountnumber, int Balance) {
		this.AccountHolderName = AccountHolderName;
		this.Accountnumber = Accountnumber;
		this.Balance = Balance;
	}

	public String getAccountnumber() {
		return Accountnumber;
	}
	public String getAccountHoldername() {
		return AccountHolderName;
	}
	public int getBalance() {
		return Balance;
	}
	void Deposit(int amount) {
		if (amount > 0) {
			Balance += amount;
		}
		System.out.println("Total Balance:"+Balance);
	}
	void Withdraw(int amount) {
		if (amount > 0 && amount <= Balance) {
			Balance -= amount;
		}
		System.out.println("Balance :"+Balance);
	}
}
public class Bank {
	public static void main(String[] args) {
		Banks obj = new Banks();
		Account ac1 = new Account("Sanjay", "25896314", 12000);
		Account ac2 = new Account("Praveen", "69852214", 15000);
		obj.addAccount(ac1);
		obj.addAccount(ac2);
		obj.depositAccount("25896314", 1000);
        obj.WithdrawAccount("69852214", 11000);
		obj.printAccountdetails();
	}

}
