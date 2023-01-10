package com.kh.jdbc.homework.team.controller;

import java.util.List;

import com.kh.jdbc.day01.student.model.dao.StudentDAO;
import com.kh.jdbc.day01.student.model.vo.Student;
import com.kh.jdbc.homework.team.model.dao.TeamDAO;
import com.kh.jdbc.homework.team.model.vo.Team;

public class TeamController {
	
	public List<Team> printAll() {  // SELECT* FROM MEMBER_TBL
		TeamDAO tDao = new TeamDAO();
		List<Team> team = tDao.selectAll();
		return team;
	}
	public List<Team> printAllByName(String teamName) {
		TeamDAO tDao = new TeamDAO();
		List<Team> tList = tDao.selectAllByName(teamName);
		return tList;
	}
	public int registerMember(Team team) {
		TeamDAO tDao = new TeamDAO();
		int result = tDao.insertMember(team);
		return result;
	}
	public int modifyTeam(Team team) {
		TeamDAO tDao = new TeamDAO();
		int result = tDao.updateTeam(team);
		return result;
	}
	public Team printOneByName(String teamName) {
		TeamDAO tDao = new TeamDAO();
		Team team = tDao.selectOneById(teamName);
		return team;
	}
	public int removeTeam(String teamName) {
		TeamDAO tDao = new TeamDAO();
		int result = tDao.deleteTeam(teamName);
		return result;
	}
}
