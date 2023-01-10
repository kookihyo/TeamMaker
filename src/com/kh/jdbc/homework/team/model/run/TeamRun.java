package com.kh.jdbc.homework.team.model.run;

import java.util.List;

import com.kh.jdbc.homework.team.controller.TeamController;
import com.kh.jdbc.homework.team.model.view.TeamView;
import com.kh.jdbc.homework.team.model.vo.Team;

public class TeamRun {
	public static void main(String[] args) {
		Team team = null;
		TeamView tView = new TeamView();
		List<Team> tList = null;
		String teamName = "";
		int result = 0;
		done:
		while(true) {
			int choice = tView.mainMenu();
			TeamController tCon = new TeamController();
			switch(choice) {
			case 1 :
				tList =tCon.printAll();
				if(!tList.isEmpty()) {
					tView.showAll(tList);
				}else {
					tView.displayError("일치하는 데이터가 없습니다!");
				}
				break;
			case 2:
				teamName =tView.inputTeamName("검색");
				tList = tCon.printAllByName(teamName);
				// sList 항상 null이 아니다. studentDAO:70
				if(!tList.isEmpty()) {
					tView.showAll(tList);
				}else {
					tView.displayError("일치하는 데이터가 없습니다.");
				}
				break; 
				
			case 3:
				team = tView.inputTeam();
				result = tCon.registerMember(team);
				if(result > 0) {
					// 성공!!
					tView.displaySuccess("가입 완료!! ");
				}else {
					//실패!!
					tView.displayError("가입 실패. ");
				}
				break;
			case 4:
				teamName = tView.inputTeamName("수정");
				team = tCon.printOneByName(teamName);
				if(team !=null) {
					team = tView.modifyTeam(team);
					tCon.modifyTeam(team);
				}else {
					tView.displayError("일치하는 팀이 없습니다.");
				}
				break;
			case 5:
				teamName = tView.inputTeamName("삭제");
				result = tCon.removeTeam(teamName);
				if(result > 0) {
					tView.displaySuccess("탈퇴완료");
				}else{
					tView.displayError("탈퇴실패");
				}
				break;
			case 0 : break done;
			default :
				tView.printMessage("잘못 입력하셨습니다 . 1~5번 메뉴를 다시입력해주세요!");
				break;
			}
		}
			
	}
}

