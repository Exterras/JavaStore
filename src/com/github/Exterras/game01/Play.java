package com.github.Exterras.game01;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ex = true;	
		System.out.println("가위:1, 바위:2, 보:3");
		
		while(ex){
			Scanner s = new Scanner(System.in);
			String str = s.next();

			if(!str.equals("exit")){
				System.out.println(str+"입니다");
				System.out.println("");
				
			} else {
				ex = false;
				System.out.println("종료되었습니다.");
			}
		}
	}
}
