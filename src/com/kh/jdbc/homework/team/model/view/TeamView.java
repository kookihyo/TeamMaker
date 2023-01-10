package com.kh.jdbc.homework.team.model.view;

import java.util.List;
import java.util.Scanner;

import com.kh.jdbc.day01.student.model.vo.Student;
import com.kh.jdbc.homework.team.model.vo.Team;

public class TeamView {

	public int mainMenu() {
		Scanner sc =new Scanner(System.in);
		System.out.println("===== 팀조회 프로그램  =====");
		System.out.println("1.팀 전체 목록 조회");
		System.out.println("2.팀 이름로 조회");
		System.out.println("3.팀 등록");
		System.out.println("4.팀 정보 수정");
		System.out.println("5.팀 탈퇴");
		int select = sc.nextInt();
		return select;
	}
	
	public void showAll(List<Team> teams) {
		System.out.println("======= 팀 전체 목록 조회 결과=======");
		for(Team tOne : teams) {
			System.out.println("팀 이름 : " + tOne.getTeamName());
			System.out.println(",1차전 승점 :" +  tOne.getTeamFirstScore());
			System.out.println(",2차전 승점 :" +  tOne.getTeamSecondScore());
			System.out.println(",3차전 승점 :" +  tOne.getTeamThirdScore());
			System.out.println(",득점 수" +  tOne.getTeamGoal());
			System.out.println(",진출 여부" +  tOne.getTeamCheck());
		}
	}
	public void showOne(Team team) {
		System.out.println("팀 이름 : " + team.getTeamName());
		System.out.println(",1차전 승점 :" +  team.getTeamFirstScore());
		System.out.println(",2차전 승점 :" +  team.getTeamSecondScore());
		System.out.println(",3차전 승점 :" +  team.getTeamThirdScore());
		System.out.println(",득점 수" +  team.getTeamGoal());
		System.out.println(",진출 여부" +  team.getTeamCheck());
	}

	public String inputTeamName(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message + "할 팀이름 입력 :");
		String teamName = sc.next();
		return teamName;
	}

	public Team inputTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("팀 이름 : ");
		String teamName = sc.next();
		System.out.println("1차전 승점 : ");
		int teamFirstScore = sc.nextInt();
		System.out.println("2차전 승점 : ");
		int teamSecondScore = sc.nextInt();
		System.out.println("3차전 승점 : ");
		int teamThirdScore = sc.nextInt();
		System.out.println("득점 수 : ");
		int teamGoal = sc.nextInt();
		System.out.println("진출여부 : ");
		String teamCheck = sc.next();
		Team team = new Team(teamName, teamFirstScore, teamSecondScore, teamThirdScore, teamGoal, teamCheck);
		return team;
	}
	public Team modifyTeam(Team team) {
		Scanner sc = new Scanner(System.in);
	//	Student student = new Student();
		System.out.print("수정할 1차전 승점 입력 :");
		int teamFirstScore = sc.nextInt();
		System.out.print("수정할  2차전 승점 입력 :");
		int teamSecondScore = sc.nextInt();
		System.out.print("수정할  3차전 승점 입력 :");
		int teamThirdScore = sc.nextInt();
		System.out.print("수정할 골수 입력 :");
		int teamGoal = sc.nextInt();
		System.out.print("수정할  진출여부 입력");
		String teamCheck = sc.next();
		team.setTeamFirstScore(teamFirstScore);
		team.setTeamSecondScore(teamSecondScore);
		team.setTeamThirdScore(teamThirdScore);
		team.setTeamGoal(teamGoal);
		team.setTeamCheck(teamCheck);
		return team;
	}




public void printMessage(String msg) {
	System.out.println(msg);
}
public void displaySuccess(String message) {
	System.out.println("[서비스 성공] :" + message);
}
public void displayError(String message) {
	System.out.println("[서비스 실패] :" + message);
}
}