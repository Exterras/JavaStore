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
			System.out.println("1.Account Create" + "\t\t" + "2.Account List" + "\t\t" + "3.Deposit" + "\t"
					+ "4.Withdraw" + "\t" + "5.Exit" + "\t");
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
		int balance; // point

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
		System.out.println("Account" + "\t\t" + "Owner" + "\t" + "Deposit");
		for (int i = 0; i < count; i++) {
			System.out.print(accountArray[i].getAno() + "\t\t" + accountArray[i].getOwner() + "\t"
					+ accountArray[i].getBalance());
			System.out.println("");
		} // point
	}

	private static void deposit() { // write
		// call findAccount
		System.out.println("------" + "\n" + "Deposit" + "\n" + "------");
	}

	private static void withdraw() { // write
		// call findAccount
		System.out.println("-------" + "\n" + "Withdraw" + "\n" + "-------");
	}

	/*
	 * private static Account findAccount(String ano){
	 * 
	 * }
	 */
}
