package com.github.Exterras.studies;

import java.util.Scanner;

public class TeamProgram {
	// field
	
	// constructor
	
	// method
	public static void main(String[] args) {
		System.out.println("�� ���� ���α׷��Դϴ�.");
		
		System.out.print("���� �������� �� �ο��� �Է��ϼ��� : ");
		Scanner s = new Scanner(System.in);
		int classNumber = s.nextInt(); 
		
		System.out.print("�� ���� �ִ�� �����Ǵ� �ο��� ���� �Է��ϼ��� : ");
		int teamNumber = s.nextInt();
		
		int teamIdx = 0;
		if((classNumber%teamNumber) != 0){
			teamIdx = (classNumber/teamNumber)+1; 
		} else {
			teamIdx = (classNumber/teamNumber); 
		}
		// [���ǰ���] �� �ο��� ���� �ִ�� �����Ǵ� �ο��� ���� ������ ���� ������ ���´�. �װ��� teamIdx�� �־���.
		// classNumber�� teamNumber�� �������� �������� 0�� �ƴϸ� �װ��� 1�� ���ϰ� �������� 1�� ������ �ʴ´�.
		
		System.out.println(
				"���� ������ �ο��� �̸��� ��� �����ÿ�. "
				+ "���� �� �ִ� �ο��� �ִ� "+ teamIdx +" ���Դϴ�.");
		// ���� ������ŭ ����� �Է��϶�� �޽����� ����Ѵ�.
		
		String[] arrTeamName = new String[teamIdx]; 
		// [����Է¹迭] ���� ����[teamIdx]��ŭ ����� �Է��ϴ� �迭�� arrTeamName ���� �������.
		
		Scanner n = new Scanner(System.in);
		for (int i = 0; i < arrTeamName.length; i++) {
			arrTeamName[i] = n.nextLine();
		} // ���� ������ŭ ����� �Է��ϴ� �۾��� �Ѵ�.
		
		
		int[] arrRandomIdx = new int[arrTeamName.length];
		// ������� �Է��� ����� ���� �迭�� arrRandomIdx���� �������. 
		// �迭�� ���̴� ����� �Է¹��� ����ŭ[arrTeamName.length]���� �������.
		
		for (int i = 0; i < arrTeamName.length; i++) {
			arrRandomIdx[i] = (int)(Math.random()*arrTeamName.length);
			for (int j = 0; j < i; j++) {
				if(arrRandomIdx[i] == arrRandomIdx[j]){
					i--;
					break;
				}
			}
		} 
		// arrRandomIdx[i]��°����  arrTeamName.length ��ŭ�� ������ �������� �־��ش�.
		// �� �� ���� [i]��°���� �ٸ����� ���Եǵ��� ���� for���� ����Ͽ� �ߺ��� �����Ͽ���.
		
		for (int i = 0; i < arrTeamName.length; i++) {
			arrTeamName[i] = arrTeamName[arrRandomIdx[i]];
			System.out.println((i+1)+"�� : "+ arrTeamName[i]);
		}
		// (Point) �����Լ��� ���� arrRandomIdx[i]�� ���� arrTeamName�� �ε����� Ȱ���Ͽ� arrTeamName[i]��°���� �ε����� ���´�.
	}
}