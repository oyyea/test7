package test7;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated=new Date();
	
	String name=new String();
	ArrayList<Transaction>transaction = new ArrayList<Transaction>();
	
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
	}
	
	Account(double annualInterestRate,String name,int id,double balance){
		this.name=name;
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	
	public void withdraw(double money) {
		Transaction t=new Transaction('W',balance,money,"È¡¿î");
		balance-=money;
		transaction.add(t);
	}
	
	public void deposit(double money) {
		Transaction t=new Transaction('D',balance,money,"´æ¿î");
		balance+=money;
		transaction.add(t);
	}
	
	public void printacount() {
		System.out.println(name+" "+annualInterestRate+"% "
				+balance);
		for(int i=0;i<transaction.size();i++) {
			Transaction t=transaction.get(i);
			t.printtransaction();
		}
	}
}
