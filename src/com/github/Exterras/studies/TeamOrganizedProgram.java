package com.github.Exterras.studies;

import java.util.Scanner;

public class TeamOrganizedProgram {
	// field
	
	// constructor
	
	// method
	void organizedTeamMtd(){
		System.out.println("�� ���� ���α׷��Դϴ�.");

		System.out.print("���� �������� �� �ο��� �Է��ϼ��� : ");
		Scanner s = new Scanner(System.in);
		int classNumber = s.nextInt();

		System.out.print("�� ���� �ִ�� �����Ǵ� �ο��� ���� �Է��ϼ��� : ");
		int teamNumber = s.nextInt();

		int teamIdx = 0;
		if ((classNumber % teamNumber) != 0) {
			teamIdx = (classNumber / teamNumber) + 1;
		} else {
			teamIdx = (classNumber / teamNumber);
		}
		// [���ǰ���] �� �ο��� ���� �ִ�� �����Ǵ� �ο��� ���� ������ ���� ������ ���´�. �װ��� teamIdx�� �־���.
		// classNumber�� teamNumber�� �������� �������� 0�� �ƴϸ� �װ��� 1�� ���ϰ� �������� 1�� ������ �ʴ´�.

		System.out.println(
				"���� ������ �ο��� �̸��� ��� �����ÿ�. " + 
				"���� �� �ִ� �ο��� �ִ�  " + teamIdx + " ���Դϴ�.");
		// ���� ������ŭ ����� �Է��϶�� �޽����� ����Ѵ�.

		Scanner n = new Scanner(System.in);
		
// 		type 1
//		String[] arrTeamName = new String[teamIdx];
//		// [����Է¹迭] ���� ����[teamIdx]��ŭ ����� �Է��ϴ� �迭�� arrTeamName ���� �������.
//		for (int i = 0; i < arrTeamName.length; i++) {
//			arrTeamName[i] = n.nextLine();
//		} // ���� ������ŭ ����� �Է��ϴ� �۾��� �Ѵ�.
		
//		type 2
		String msgTeamName = n.nextLine();
		String[] arrMsgTeamName = msgTeamName.split(",");
		
		int[] arrRandomIdx = new int[teamIdx];
		// ������� �Է��� ����� ���� �迭�� arrRandomIdx���� �������.
		// �迭�� ���̴� ����� �Է¹��� ����ŭ[arrTeamName.length]���� �������.

		for (int i = 0; i < teamIdx; i++) {
			arrRandomIdx[i] = (int) (Math.random() * teamIdx);
			for (int j = 0; j < i; j++) {
				if (arrRandomIdx[i] == arrRandomIdx[j]) {
					i--;
					break;
				}
			}
		}
		// arrRandomIdx[i]��°���� arrTeamName.length ��ŭ�� ������ �������� �־��ش�.
		// �� �� ���� [i]��°���� �ٸ����� ���Եǵ��� ���� for���� ����Ͽ� �ߺ��� �����Ͽ���.

		String[] arrTempTeamName = new String[teamIdx];
		for (int i = 0; i < teamIdx; i++) {
//			arrTempTeamName[i] = arrTeamName[arrRandomIdx[i]]; // type 1
			arrTempTeamName[i] = arrMsgTeamName[arrRandomIdx[i]]; // type 2
		}
		// (Point) �����Լ��� ���� arrRandomIdx[i]�� ���� arrTeamName�� �ε����� Ȱ���Ѵ�.
		// arrTeamName�� �迭���̿� Ÿ���� �Ȱ��� arrTempTeamName[i]�� �����.
		// arrTeamName[�����ε��� =arrRandomIdx[i]]�� arrTempTeamName[i]�� �ִ´�.

		for (int i = 0; i < teamIdx; i++) {
//			arrTeamName[i] = arrTempTeamName[i]; // type 1
			arrMsgTeamName[i] = arrTempTeamName[i];
//			System.out.println((i + 1) + "�� : " + arrTeamName[i]); // type 1
			 System.out.println((i+1)+"�� : "+arrMsgTeamName[i]); // type 2
		}
		// arrTempTeamName[i]�� ���� �ٽ� arrTeamName[i]�� ����ִ´�.
		// �׸��� arrTeamName[i]�� ����Ѵ�
	}
}