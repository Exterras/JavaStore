package com.github.Exterras.game01;

public class Run6 {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임에 오신것을 환영합니다.");
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		System.out.println("종료를 원하시면 종료 를 입력하세요.");
		
		Run6Service svs = new Run6Service();
		svs.runWhile();
	}
}
