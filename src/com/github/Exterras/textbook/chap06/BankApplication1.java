package com.github.Exterras.textbook.chap06;

import java.util.Scanner;

public class BankApplication1 {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner s = new Scanner(System.in);
//	private static Account1 act = new Account1();
	
	private static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {

			for (int i = 0; i < 70; i++) {System.out.print("-");} System.out.println("");
			System.out.println("1.Account Create" + "\t\t" + "2.Account List" + "\t\t" + "3.Deposit" + "\t" + "4.Withdraw"
					+ "\t" + "5.Exit" + "\t");
			for (int i = 0; i < 70; i++) {System.out.print("-");} System.out.println("");
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

	private static void createAccount() {
		String s1, s2;
		int i1;
		//implement
		
		//accountArray[count] = new Account1();
		 
		System.out.println("------------"+"\n"+"Account Create"+"\n"+"------------");
		System.out.print("Account Number : ");
		s1 = s.next();
		//accountArray[count].setAno(s.next());
		System.out.print("Account Owner : ");
		s2 = s.next();
		//accountArray[count].setOwner(s.next());
		System.out.print("First Deposit : ");
		//accountArray[count].setBalance(s.nextInt());
		i1 = s.nextInt();
		System.out.println("Account Created!");
		
		accountArray[count] = new Account1(s1 , s2, i1 );
		
		count++;
	}

	private static void accountList() {
		if(count == 0 ){
			System.out.println("¿¡·¯");
			return;
		}
		//implement
//		System.out.println("----------"+"\n"+"Account List"+"\n"+"----------");
//		System.out.println("Account"+"\t\t"+"Owner"+"\t"+"Deposit");
//		System.out.print(accountArray[count].getAno() +"\t\t"+ accountArray[count].getOwner() +"\t"+ accountArray[count].getBalance());
//		System.out.println("");
		
		System.out.println("----------"+"\n"+"Account List"+"\n"+"----------");
		System.out.println("Account"+"\t\t"+"Owner"+"\t"+"Deposit");
		for(int i=0; i < count; i++){						
			System.out.print(accountArray[i].getAno() +"\t\t"+ accountArray[i].getOwner() +"\t"+ accountArray[i].getBalance());
			System.out.println("");
		}
	}

	private static void deposit() {
		//implement 
		//call findAccount
		System.out.println("------"+"\n"+"Deposit"+"\n"+"------");
	}

	private static void withdraw() {
		//implement
		//call findAccount
		System.out.println("-------"+"\n"+"Withdraw"+"\n"+"-------");
	}
	
/*	private static Account findAccount(String ano){
		
	}*/
}
