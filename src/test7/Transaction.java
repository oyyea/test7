package test7;

import java.util.Date;

public class Transaction {
	private Date date=new Date();
	private char type;
	private double amount;
	private double balance;
	private String description=new String();
	
	public Transaction(char type,double amount,double balance,
			String description) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	
	public void printtransaction() {
		System.out.println(description+":"+balance);
	}
}
