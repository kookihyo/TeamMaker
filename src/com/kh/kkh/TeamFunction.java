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
    	 System.out.println("====�������� ���� Ȯ��====");
    	 System.out.println("�� ���� �Է�");
    	 System.out.println("�� ���� ���");
    	 System.out.println("���� ���� Ȯ��");
    	 System.out.println("���α׷� ����");
    	 System.out.println("�޴� �Է� : ");
    	int menu = sc.nextInt();
    	 return menu;
     }
     
     public void inputScore() {
    	 for(int i = 0; i <teams.length; i++) {
    		 Scanner sc = new Scanner(System.in);
    		 System.out.println("====="+(i+1)+"��° �� ���� �Է�=====");
    			System.out.print(" �� �̸� �Է� :");
    			String name = sc.next();
    			System.out.print(" 1�� ���� �Է� :");
    			int firstScore = sc.nextInt();
    			System.out.print(" 2�� ���� �Է� :");
    			int secondScore = sc.nextInt();
    			System.out.print(" 3�� ���� �Է� :");
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
    		 System.out.println("====="+(i+1) +"���� �� ���� ���");
    		 System.out.println("�� ������");
    		 System.out.println("1�� ���� : " + teams[i].getFirstScore() + " 2�� ���� : " + teams[i].getSecondScore() + " 3�� ���� " + teams[i].getThirdScore() +  "�Դϴ�");
    	 }
     }
     
     public void checkPass() {
    	 /*1.������ 5�� ������ ��� Ż���Ѵ�
    	  * 2. 4���� ��� 5���� ���� ��� ���峷�� ���� 2���� Ż�� Ż���Ѵ�.
    	  */
    	 for(int i = 0; i < teams.length; i++) {
    		 int num1 = teams[i].getFirstScore();
    		 int num2 = teams[i].getSecondScore();
    		 int num3 = teams[i].getThirdScore();
    		 double avg = (num1+num2+num3);
    		 System.out.println((i+1) + "��°," + teams[i].getName()+ "�� ���");
    		 if(avg >= 5) {
    			 System.out.println("����");
    		 }else {
    			 if(avg < 4) {
    				 System.out.println("Ż��");
    			 }
    		 }
    			
    	 }
     }
     public void printGoodBye() {}
     
     public void printException() {}
     }

