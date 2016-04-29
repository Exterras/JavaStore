package com.github.Exterras.textbook.chap06;

public class Account1 {
	private String ano; // accountNo
	private String owner; // accountOwner
	private int balance; // accountBalance

	public Account1(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
