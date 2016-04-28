package com.github.Exterras.textbook.chap06;

import java.util.Scanner;

public class BankApplication1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner s = new Scanner(System.in);
	private static int count = 0; // point

	private static String ano; //create, deposit, withdraw
	private static int balance, balanceTemp, accArrCnt; // deposit, withdraw 

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			for (int i = 0; i < 70; i++) {
				System.out.print("-");
			}
			System.out.println("");
			System.out.println(
					"1.Create" + "\t" + "2.List" + "\t\t" + "3.Deposit" + "\t" + "4.Withdraw" + "\t" + "5.Exit" + "\t");
			for (int i = 0; i < 70; i++) {
				System.out.print("-");
			}
			System.out.println("");
			System.out.print("Select> ");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {

			}
		}
		System.out.println("Program Terminated.");
	}

	private static void createAccount() { // write
		String owner;
		
		System.out.println("------------" + "\n" + "Account Create" + "\n" + "------------");
		System.out.print("Account Number : ");
		ano = s.next();

		System.out.print("Account Owner : ");
		owner = s.next();

		System.out.print("First Deposit : ");
		balance = s.nextInt();

		System.out.println("Account Created!");

		accountArray[count] = new Account1(ano, owner, balance); // main point
		count++; // sub point -> next create & show list
	}

	private static void accountList() { // write
		if (count == 0) {
			System.out.println("Error");
			return;
		}

		System.out.println("----------" + "\n" + "Account List" + "\n" + "----------");
		System.out.println("Account" + "\t" + "Owner" + "\t" + "Deposit");
		for (int i = 0; i < count; i++) {
			System.out.print(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			System.out.println("");
		} // point
	}

	private static void deposit() { // write
		System.out.println("------" + "\n" + "Deposit" + "\n" + "------");
		
		System.out.print("Account Number : ");
		ano = s.next();
		
		findAccount(ano);
		
		System.out.print("Deposit : ");
		balance = s.nextInt();
		
		balance = balanceTemp + balance;
		accountArray[accArrCnt].setBalance(balance);
		
		System.out.println("Deposit Successful!");
	}

	private static void withdraw() { // write
		System.out.println("-------" + "\n" + "Withdraw" + "\n" + "-------");
		
		System.out.print("Account Number : ");
		ano = s.next();
		
		findAccount(ano);
		
		System.out.print("Withdraw : ");
		balance = s.nextInt();
		
		balance = balanceTemp - balance;
		accountArray[accArrCnt].setBalance(balance);
		
		System.out.println("Withdraw Successful!");
	}

	private static Account1 findAccount(String ano) {
		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				balanceTemp = accountArray[i].getBalance();
				accArrCnt=i;
				break;
			}
		}
		return null;
	}
}
