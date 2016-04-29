package com.github.Exterras.textbook.chap06;

public class BankApplication1 {
	private static Account1[] accountArray = new Account1[100];
	private static int count = 0; // point
	// 클래스 내에 메인함수로 실행하기 위해 별도의 객체생성없이 실행하고자 할 때 private static으로 선언

	public static void main(String[] args) {
		boolean run = true;
		// 반복문 flag

		while (run) {
			UserObj.mLine(1, 70); // 기준선 mLine문을 활용한 줄긋기
			
			System.out.println(
					"1.Create" + "\t" + "2.List" + "\t\t" + "3.Deposit" + "\t" + "4.Withdraw" + "\t" + "5.Exit" + "\t");
			// 기준 레코드 작성
			
			UserObj.mLine(1, 70); // 기준선 mLine문을 활용한 줄긋기
			
			System.out.print("Select> "); // 선택 항목

			int selectNo = UserObj.getScan(0);

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
				System.out.println("404 Error : File not Found");
			}
		}
		System.out.println("Program Terminated.");
	}

	private static void createAccount() { // write
		String ano, owner;
		int balance;
		UserObj.mLine(1, 14);
		System.out.println("Account Create");
		UserObj.mLine(1, 14);
		System.out.print("Account Number : ");
		ano = UserObj.getScan("");
	
		if(findAccount(ano) != null){
			System.out.println("Account Already Exist!");
			ano = null; // clean variable
			return; 
		} // 내가 적은 계좌번호가 이미 Account1 클래스에 저장되있다면 빠져나오는 곳
		
		System.out.print("Account Owner : ");
		owner = UserObj.getScan("");

		System.out.print("First Deposit : ");
		balance = UserObj.getScan(0);
		// 계좌 생성을 위해 계좌번호, 계좌주, 첫입금액을 적음

		accountArray[count] = new Account1(ano, owner, balance); // main point
		System.out.println("Account Created!");
		count++; // sub point -> next create & show list
		// 입력받은 정보를 계좌 생성을 위해 생성자를 통해 값을 전달하였다. 
		// 성공 메시지와 함께  accountArray 다음 배열의 값을 받을 준비를 하기 위해 count++한다
	}

	private static void accountList() { // write
		if (count == 0) {
			System.out.println("Error");
			return;
		} //계좌가 하나도 만들어지지 않았다면 에러를 출력한다.
		UserObj.mLine(1, 12);
		System.out.println("Account List");
		UserObj.mLine(1, 12);
		
		System.out.println("Account" + "\t" + "Owner" + "\t" + "Deposit");
		for (int i = 0; i < count; i++) {
			System.out.print(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			System.out.println("");
		} // point
		// get함수를 통해 리스트를 출력한다.
	}

	private static void deposit() { // write
		String ano;
		int balance;
		UserObj.mLine(1, 7);
		System.out.println("Deposit");
		UserObj.mLine(1, 7);
		System.out.print("Account Number : ");
		ano = UserObj.getScan("");

		Account1 tempAcc = findAccount(ano);
		// findAccount를 사용하여 계좌정보를 찾는다

		if (tempAcc != null) {
			System.out.print("Deposit : ");
			balance = UserObj.getScan(0);

			balance = tempAcc.getBalance() + balance;
			tempAcc.setBalance(balance);

			System.out.println("Deposit Successful!");
			// 입금처리
		} else {
			System.out.println("No Have Account!");
			// 예외처리
		}
	}

	private static void withdraw() { // write
		String ano;
		int balance;
		UserObj.mLine(1, 8);
		System.out.println("Withdraw");
		UserObj.mLine(1, 8);
		
		System.out.print("Account Number : ");
		ano = UserObj.getScan("");

		Account1 tempAcc = findAccount(ano);
		// findAccount를 사용하여 계좌정보를 찾는다
		
		if (tempAcc != null) {
			System.out.print("Withdraw : ");
			balance = UserObj.getScan(0);
			
			if(tempAcc.getBalance() >= balance){
				balance = tempAcc.getBalance() - balance;
				tempAcc.setBalance(balance);
				
				System.out.println("Withdraw Successful!");
				// 출금처리
			} else {
				System.out.println("No Sufficient Balance Your Have!");
				// 잔고보다 많은 돈을 출금할 시 예외처리
			}
			
		} else {
			System.out.println("No Have Account!");
		} // 예외처리
	}

	private static Account1 findAccount(String ano) {
		boolean isHere = false;
		int i;
		for (i = 0; i < count; i++) { // 계좌 배열 생성횟수만큼 돈다 -> 리스트에 있는 모든 정보의 개수
			if (accountArray[i].getAno().equals(ano)) { 
				// accountArray[i]의 get함수와 입력받은 매개변수 ano와 같다면
				isHere = true;
				break;
				// flag처리 후 for문 중단, 같은걸 찾앗으므로 더 이상 반복할 필요가 없다
			}
		}

		if (isHere) { // 입력한 계좌정보와 찾은 계좌정보가 똑같다면
			return accountArray[i]; // 찾은 계좌정보를 리턴
		} else {
			return null; // 리턴하지 말아라
		}

	}
}
