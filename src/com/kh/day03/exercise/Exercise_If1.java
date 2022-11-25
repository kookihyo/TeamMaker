package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	// 정수하나를 입력받아서 양의 정수인지, 0인지 , 음의 정수인지
	// 판별하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// indent 정리 : ctrl + shift + f
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력 : ");
		int num = sc.nextInt();
		String result = "";
		if (num < 0) {
			result = "음의 정수";
		} else if (num > 0) {
			result = "양의 정수";
		} else {		 // else마지막은 조건식이 필요 없으니 if 조건식 안씀.
			result = "0";
		}
		System.out.println(num + "은/는 " + result + "입니다.");

	}

}
