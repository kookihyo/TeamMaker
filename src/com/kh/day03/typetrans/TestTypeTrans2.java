package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main(String [] args) {
		byte b = 127;	// 1byte
		int i = 100;	// 4byte
		
		// 자동형변환
		System.out.println(b + i);	// b가 int로 자동형변환 되어서 출력 가능
		System.out.println(10/4);	
		System.out.println(10.0/4);	// 4는 4.0(실수)로 자동형변환
		
		// 강제 형변환 -> 큰 자료형을 작은 자료형으로 변환, 데이터 손실 발생!!(소수점이 잘리는 등)
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);			// int 2.9가 2가 되어 값을 이룸
		System.out.println((int)(2.9 + 1.8));		
		System.out.println((int)2.9 + (int)1.8);
	}

}
