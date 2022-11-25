package com.kh.day02.variable;

public class TestVariable {
	public static void main(String [] args) {
		//  중요!!!! 자료형 변수명 대입연산자 데이터;
		int kh = 34;
		String msg = "Hello World";
		int num;   // 변수의 선언  변수란 변하는 수
		num = 100;  // 변수의 초기화
		// int num = 100;
		System.out.println("kh");
		System.out.println(kh);   //재사용하기 위해 34가 아닌 kh사용
		System.out.println(msg);
		System.out.println(num);
		num = 101;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
	}

}
