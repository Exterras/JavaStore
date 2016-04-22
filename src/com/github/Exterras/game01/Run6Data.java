package com.github.Exterras.game01;

public class Run6Data {
	String userHand;
	String comHand;

	int comNum;
	int win;
	int lose;
	int draw;
	
	boolean ex;
	
	public Run6Data(){
		userHand = "";
		comHand = "";

		comNum = 0;
		win = 0;
		lose = 0;
		draw = 0;
		ex = true;
	}
	
	public Run6Data(String userHand){
		this.userHand = userHand;
	}
	
	public Run6Data(String userHand, String comHand){
		this.userHand = userHand;
		this.comHand = comHand;
	}
	
	public Run6Data(int comNum, int win, int lose, int draw){
		this.comNum = comNum;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
	
	public Run6Data(boolean ex){
		this.ex = ex;
	}	
}
