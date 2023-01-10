package com.kh.kkh;

import java.util.Scanner;

import com.kh.day08.student.Student;

public class TeamFunction {
     Team [] teams;
     
     public TeamFunction() {
    	 teams = new Team[4];
     }
     
     public int printMenu() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("====월드컵팀 성적 확인====");
    	 System.out.println("팀 승점 입력");
    	 System.out.println("팀 승점 출력");
    	 System.out.println("진출 여부 확인");
    	 System.out.println("프로그램 종료");
    	 System.out.println("메뉴 입력 : ");
    	int menu = sc.nextInt();
    	 return menu;
     }
     
     public void inputScore() {
    	 for(int i = 0; i <teams.length; i++) {
    		 Scanner sc = new Scanner(System.in);
    		 System.out.println("====="+(i+1)+"번째 팀 정보 입력=====");
    			System.out.print(" 팀 이름 입력 :");
    			String name = sc.next();
    			System.out.print(" 1차 승점 입력 :");
    			int firstScore = sc.nextInt();
    			System.out.print(" 2차 승점 입력 :");
    			int secondScore = sc.nextInt();
    			System.out.print(" 3차 승점 입력 :");
    			int thirdScore = sc.nextInt();
    			teams[i] = new Team();
    			teams[i].setName(name);
    			teams[i].setFirstScore(firstScore);
    			teams[i].setSecondScore(secondScore);
    			teams[i].setThirdScore(thirdScore);
    	 }  
     }
     public void printScore() {
    	 for(int i = 0; i < teams.length; i++) {
    		 System.out.println("====="+(i+1) +"번쨰 팀 정보 출력");
    		 System.out.println("팀 승점은");
    		 System.out.println("1차 승점 : " + teams[i].getFirstScore() + " 2차 승점 : " + teams[i].getSecondScore() + " 3차 승점 " + teams[i].getThirdScore() +  "입니다");
    	 }
     }
     
     public void checkPass() {
    	 /*1.승점은 5점 이하인 경우 탈락한다
    	  * 2. 4팀이 모두 5점을 넘을 경우 가장낮은 승점 2팀은 탈락 탈락한다.
    	  */
    	 for(int i = 0; i < teams.length; i++) {
    		 int num1 = teams[i].getFirstScore();
    		 int num2 = teams[i].getSecondScore();
    		 int num3 = teams[i].getThirdScore();
    		 double avg = (num1+num2+num3);
    		 System.out.println((i+1) + "번째," + teams[i].getName()+ "팀 결과");
    		 if(avg >= 5) {
    			 System.out.println("진출");
    		 }else {
    			 if(avg < 4) {
    				 System.out.println("탈락");
    			 }
    		 }
    			
    	 }
     }
     public void printGoodBye() {}
     
     public void printException() {}
     }

