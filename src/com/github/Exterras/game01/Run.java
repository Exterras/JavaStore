package com.github.Exterras.game01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		int userNum;
		int comNum;
		boolean ex = true;
		
		System.out.println("가위 바위 보 게임에 오신것을 환영합니다.");
		System.out.println("가위는 1, 바위는 2, 보는 3을 눌러주세요.");
		System.out.println("종료 버튼은 4번입니다.");
		
		while(ex){
			Scanner s = new Scanner(System.in);
			userNum = s.nextInt();
			
			if(userNum == 4){
				ex = false;
				System.out.println("종료되었습니다");
			} else if (userNum < 1 || userNum > 4){
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("가위는 1, 바위는 2, 보는 3을 눌러주세요.");
				System.out.println("종료 버튼은 4번입니다.");
			} else {
		
				comNum = (int)((Math.random()*3)+1);
				int result = ((userNum-comNum)+3)%3;
					
				if(result == 0){
					System.out.println("당신이 낸 것은 "+userNum+"입니다.");
					System.out.println("컴퓨터가 낸 것은 "+comNum+"입니다.");
					System.out.println("비기셨습니다.");
				} else if(result == 1){
					System.out.println("당신이 낸 것은 "+userNum+"입니다.");
					System.out.println("컴퓨터가 낸 것은 "+comNum+"입니다.");
					System.out.println("당신이 승리하셨습니다.");
				} else if(result == 2){
					System.out.println("당신이 낸 것은 "+userNum+"입니다.");
					System.out.println("컴퓨터가 낸 것은 "+comNum+"입니다.");
					System.out.println("컴퓨터가 패배하셨습니다.");
				}
			}
		}
	}
}

