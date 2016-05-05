package com.github.Exterras.studies;

import java.util.Scanner;

public class TeamProgram {
	// field
	
	// constructor
	
	// method
	public static void main(String[] args) {
		System.out.println("조 편성 프로그램입니다.");
		
		System.out.print("현재 수강생의 총 인원을 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int classNumber = s.nextInt(); 
		
		System.out.print("한 조당 최대로 편성되는 인원의 수를 입력하세요 : ");
		int teamNumber = s.nextInt();
		
		int teamIdx = 0;
		if((classNumber%teamNumber) != 0){
			teamIdx = (classNumber/teamNumber)+1; 
		} else {
			teamIdx = (classNumber/teamNumber); 
		}
		// [조의개수] 총 인원을 조당 최대로 편성되는 인원의 수를 나누면 조의 개수가 나온다. 그것을 teamIdx에 넣었다.
		// classNumber를 teamNumber를 나눳을때 나머지가 0이 아니면 그값에 1을 더하고 나머지는 1를 더하지 않는다.
		
		System.out.println(
				"조에 편성될 인원의 이름을 모두 적으시오. "
				+ "적을 수 있는 인원은 최대 "+ teamIdx +" 명입니다.");
		// 조의 개수만큼 사람을 입력하라는 메시지를 출력한다.
		
		String[] arrTeamName = new String[teamIdx]; 
		// [사람입력배열] 조의 개수[teamIdx]만큼 사람을 입력하는 배열을 arrTeamName 으로 만들었다.
		
		Scanner n = new Scanner(System.in);
		for (int i = 0; i < arrTeamName.length; i++) {
			arrTeamName[i] = n.nextLine();
		} // 조의 개수만큼 사람을 입력하는 작업을 한다.
		
		
		int[] arrRandomIdx = new int[arrTeamName.length];
		// 순서대로 입력한 사람을 섞는 배열을 arrRandomIdx으로 만들었다. 
		// 배열의 길이는 사람을 입력받은 수만큼[arrTeamName.length]으로 만들었다.
		
		for (int i = 0; i < arrTeamName.length; i++) {
			arrRandomIdx[i] = (int)(Math.random()*arrTeamName.length);
			for (int j = 0; j < i; j++) {
				if(arrRandomIdx[i] == arrRandomIdx[j]){
					i--;
					break;
				}
			}
		} 
		// arrRandomIdx[i]번째마다  arrTeamName.length 만큼의 범위의 랜덤값을 넣어준다.
		// 단 그 값이 [i]번째마다 다른값이 대입되도록 이중 for문을 사용하여 중복을 제거하였다.
		
		for (int i = 0; i < arrTeamName.length; i++) {
			arrTeamName[i] = arrTeamName[arrRandomIdx[i]];
			System.out.println((i+1)+"조 : "+ arrTeamName[i]);
		}
		// (Point) 랜덤함수로 섞은 arrRandomIdx[i]의 값을 arrTeamName의 인덱스로 활용하여 arrTeamName[i]번째마다 인덱스를 섞는다.
	}
}
