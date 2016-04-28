package com.github.Exterras.textbook.chap06;

import java.util.Scanner;

public class BankApplication1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner s = new Scanner(System.in);
	private static int count = 0; // point

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
		String ano, owner;
		int balance;

		System.out.println("--------------" + "\n" + "Account Create" + "\n" + "--------------");
		System.out.print("Account Number : ");
		ano = s.next();
	
		if(findAccount(ano) != null){
			System.out.println("Account Already Exist!");
			ano = null; // clean variable
			return; 
		}
		
		System.out.print("Account Owner : ");
		owner = s.next();

		System.out.print("First Deposit : ");
		balance = s.nextInt();

		Account1 tempAcc = findAccount(ano);
	//	if (tempAcc == null) {
			accountArray[count] = new Account1(ano, owner, balance); // main point
			System.out.println("Account Created!");
			count++; // sub point -> next create & show list
	//	} else {
	//		System.out.println("Account Already Exist!");
	//	}
	}

	private static void accountList() { // write
		if (count == 0) {
			System.out.println("Error");
			return;
		}

		System.out.println("------------" + "\n" + "Account List" + "\n" + "------------");
		System.out.println("Account" + "\t" + "Owner" + "\t" + "Deposit");
		for (int i = 0; i < count; i++) {
			System.out.print(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			System.out.println("");
		} // point
	}

	private static void deposit() { // write
		String ano;
		int balance;

		System.out.println("-------" + "\n" + "Deposit" + "\n" + "-------");

		System.out.print("Account Number : ");
		ano = s.next();

		Account1 tempAcc = findAccount(ano);

		if (tempAcc != null) {
			System.out.print("Deposit : ");
			balance = s.nextInt();

			balance = tempAcc.getBalance() + balance;
			tempAcc.setBalance(balance);

			System.out.println("Deposit Successful!");
		} else {
			System.out.println("No Have Account!");
		}
	}

	private static void withdraw() { // write
		String ano;
		int balance;
		System.out.println("--------" + "\n" + "Withdraw" + "\n" + "--------");

		System.out.print("Account Number : ");
		ano = s.next();

		Account1 tempAcc = findAccount(ano);

		if (tempAcc != null) {
			System.out.print("Withdraw : ");
			balance = s.nextInt();
			
			if(tempAcc.getBalance() >= balance){
				balance = tempAcc.getBalance() - balance;
				tempAcc.setBalance(balance);
				System.out.println("Withdraw Successful!");
			} else {
				System.out.println("No Sufficient Balance Your Have!");
			}
			
		} else {
			System.out.println("No Have Account!");
		}
	}

	private static Account1 findAccount(String ano) {
		boolean isHere = false;
		int i;
		for (i = 0; i < count; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				isHere = true;
				break;
			}
		}

		if (isHere) {
			return accountArray[i];
		} else {
			return null;
		}

	}
}
