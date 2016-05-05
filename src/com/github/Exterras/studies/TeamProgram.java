package com.github.Exterras.studies;

import java.util.Scanner;

public class TeamProgram {
	// field
	boolean flag = true;
	// constructor

	// method
	
	void printMenu(){
		System.out.println("수강생 조 관리 프로그램 입니다.");
		System.out.println("원하시는 메뉴를 선택하세요. ");
		
		System.out.println("1.조 편성하기");
		System.out.println("2.조 자리 변경하기");
		System.out.println("3.편성된 조 보여주기");
		System.out.println("4.편성된 조 초기화하기");
		System.out.println("5.종료");
	}
	
	int selectMenu(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("선택> ");
		int selectMenu = s.nextInt();
		return selectMenu;
	}
	
	void switchMenu(int selectMenu){
		TeamOrganizedProgram teamMake = new TeamOrganizedProgram();
		
		switch (selectMenu) {
		case 1:
			teamMake.organizedTeamMtd();
			break;
		case 5:
			System.out.println("프로그램이 종료되었습니다.");
			flag = false;
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		TeamProgram main = new TeamProgram();
		
		while (main.flag) {
			main.printMenu();
			main.switchMenu(main.selectMenu());
		}
	}
}
