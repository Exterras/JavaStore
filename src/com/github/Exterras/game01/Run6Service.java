package com.github.Exterras.game01;

import java.util.Scanner;

public class Run6Service {
	String userHand;
	String comHand;

	int comNum;
	int win;
	int lose;
	int draw;
	
	boolean ex;
	
	public Run6Service(){
		userHand = "";
		comHand = "";

		comNum = 0;
		win = 0;
		lose = 0;
		draw = 0;
		ex = true;
	}
	
	public void runWhile(){
		while (ex) {
			Scanner s = new Scanner(System.in);
			userHand = s.nextLine();
			comNum = (int) ((Math.random() * 3) + 1);

			int sum = win + draw + lose;
			double winAvg = Math.round(((double) win / (double) sum) * 100);

			if (comNum == 1) {
				comHand = "가위";
			} else if (comNum == 2) {
				comHand = "바위";
			} else if (comNum == 3) {
				comHand = "보";
			}

			if (userHand.equals("가위") || userHand.equals("바위") || userHand.equals("보")) {

			} else if (userHand.equals("종료")) {
				ex = false;
				System.out.println("종료되었습니다.");
				System.out.println("당신이 게임한 총 횟수는 : " + sum + "회 입니다.");
				System.out.println("당신의 승률은 : " + winAvg + "% 입니다.");
				System.out.println("당신의 전적은 " + win + "승 " + draw + "무 " + lose + "패 " + "입니다.");
				continue;
			} else {
				System.out.println("잘못 입력하셧습니다. 다시 입력해주세요.");
				System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
				System.out.println("종료를 원하시면 종료 를 입력하세요.");
				continue;
			}

			System.out.println("당신이 낸 것은 " + userHand + "입니다.");
			System.out.println("컴퓨터가 낸 것은 " + comHand + "입니다.");

			if (userHand.equals("가위")) {
				if (comHand.equals("가위")) { drawFunc(); } 
				else if (comHand.equals("바위")) { loseFunc(); } 
				else if (comHand.equals("보")) { winFunc(); }
			} else if (userHand.equals("바위")) {
				if (comHand.equals("가위")) { winFunc(); } 
				else if (comHand.equals("바위")) { drawFunc(); } 
				else if (comHand.equals("보")) { loseFunc(); }
			} else if (userHand.equals("보")) {
				if (comHand.equals("가위")) { loseFunc(); } 
				else if (comHand.equals("바위")) { winFunc(); } 
				else if (comHand.equals("보")) { drawFunc(); }
			}
			System.out.println("당신의 전적은 " + win + "승 " + draw + "무 " + lose + "패 " + "입니다.");
		}
	}
	
	public void winFunc() {
		System.out.println("당신이 승리하셨습니다."); win++;
	}

	public void drawFunc() {
		System.out.println("비기셨습니다."); draw++;
	}

	public void loseFunc() {
		System.out.println("당신이 패배하셨습니다."); lose++;
	}
}
