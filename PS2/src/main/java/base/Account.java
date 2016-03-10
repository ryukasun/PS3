package base;

import java.util.Date;

import javax.naming.InsufficientResourcesException;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {// Creates a default account
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();

	}

	public Account(int id,double balance){//Creates a specified
		// TODO Auto-generated constructor stub
		this();
		this.id =  id;
		this.balance = balance;
		//this.annualInterestRate = an;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		//double monthly = Math.pow(1+annualInterestRate, 1/12) - 1;
		double monthly = (this.getAnnualInterestRate())/12;
		return monthly;
	}
	public double withdraw(double amt) throws InsufficientFundsException{
		double cBalance = this.getBalance();
		if(amt <= cBalance){
			this.balance = cBalance - amt;
		}
		else{
			throw new InsufficientFundsException();
		}
		return this.balance;
	}
	public double deposit(double amt){
		double ccBalance = this.getBalance();
		this.balance = ccBalance + amt;
		return this.balance;
	}
	
}
