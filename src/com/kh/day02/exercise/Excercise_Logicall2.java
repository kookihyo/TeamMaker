package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logicall2 {
	public static void main(String [] args) {
		// �Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// 1���� 100������ �����ΰ�? : true
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0);    //�빮�� Ȯ�� �Ϸ��� ���ۿ� �ƽ�Ű �ڵ� Ȯ��
		/*
		int i = 65;
		int o = 97;
		// �빮������ �Ǻ�
		boolean result = (i <= word) && (word <= o); 
		*/
		boolean result = ('A' <= word) && (word <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + result);
		

		// ��� ���
	}

}
