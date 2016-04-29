package com.github.Exterras.textbook.chap06;

import java.util.Scanner;

public class UserObj {
	public static void mLine(int num, int su){
		if(num == 1){
			int i;
			for (i = 0;  i < su; i++) {
				System.out.print("-");
			}
			System.out.println("");
		} else if (num == 2){
			int i;
			for (i = 0;  i < su; i++) {
				System.out.print("=");
			}
			System.out.println("");
		}
	}
	
	public static int getScan(int chk){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	public static double getScan(double chk){
		Scanner s = new Scanner(System.in);
		return s.nextDouble();
	}
	
	public static String getScan(String chk){
		Scanner s = new Scanner(System.in);
		return s.next();
	}
}
