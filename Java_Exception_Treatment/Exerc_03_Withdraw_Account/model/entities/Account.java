package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) throws DomainException {
		
		if(value > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(value > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		this.balance -= value;
	}
	
	@Override
	public String toString() {
		return "New balance: " + this.balance;
	}
	

}
