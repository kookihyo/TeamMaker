package com.kh.jdbc.homework.team.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.jdbc.day01.student.model.vo.Student;
import com.kh.jdbc.homework.team.model.vo.Team;

public class TeamDAO {
	String URL= "jdbc:oracle:thin:@localhost:1521:XE";
	String USER = "KH";
	String PASSWORD ="KH";
	String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

	public List<Team> selectAll() {
		//드라이버 등록
	 String sql = "SELECT * FROM TEAM_TBL";
		 Team team = null;
		 List<Team> tList = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			tList= new ArrayList<Team>();
			
			while(rset.next()) {
				team = new Team();
				team.setTeamName(rset.getString("TEAM_NAME"));
				team.setTeamFirstScore(rset.getInt("TEAM_FIRST_SCORE"));
				team.setTeamSecondScore(rset.getInt("TEAM_SECOND_SCORE"));
				team.setTeamThirdScore(rset.getInt("TEAM_THIRD_SCORE"));
				team.setTeamGoal(rset.getInt("TEAM_GOAL"));
				team.setTeamCheck(rset.getString("TEAM_CHECK"));
				tList.add(team);
			}
			rset.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tList;
	}


public List<Team> selectAllByName(String teamName){
	List<Team> tList = null;
	Team team = null;
	String sql = "SELECT * FROM TEAM_TBL WHERE TEAM_NAME ='"+teamName+"'";
	try {
		Class.forName(DRIVER_NAME);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery(sql);
		tList = new ArrayList<Team>();
		while(rset.next()) {
			team = new Team();
			team.setTeamName(rset.getString("TEAM_NAME"));
			team.setTeamFirstScore(rset.getInt("TEAM_FIRST_SCORE"));
			team.setTeamSecondScore(rset.getInt("TEAM_SECOND_SCORE"));
			team.setTeamThirdScore(rset.getInt("TEAM_THIRD_SCORE"));
			team.setTeamGoal(rset.getInt("TEAM_GOAL"));
			team.setTeamCheck(rset.getString("TEAM_CHECK"));
			tList.add(team);
		}
		rset.close();
		stmt.close();
		conn.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return tList;
}
public Team selectOneById(String teamName) {
	Team team = null;
	String sql = "SELECT * FROM TEAM_TBL WHERE TEAM_NAME ='"+teamName+"'";
	//1.드라이버 등록
	try {
		Class.forName(DRIVER_NAME);
		//2. DB 연결 객체 생성
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			//3. STATEMEBT 생성,쿼리문 실행 준비완료
			Statement stmt = conn.createStatement();
			//4. 쿼리문 실형 5.결과받기
			ResultSet rset = stmt.executeQuery(sql);
			//후처리 
			if(rset.next()) {
				team = new Team ();
				team.setTeamName(rset.getString("TEAM_NAME"));
				team.setTeamFirstScore(rset.getInt("TEAM_FIRST_SCORE"));
				team.setTeamSecondScore(rset.getInt("TEAM_SECOND_SCORE"));
				team.setTeamThirdScore(rset.getInt("TEAM_THIRD_SCORE"));
				team.setTeamGoal(rset.getInt("TEAM_GOAL"));
				team.setTeamCheck(rset.getString("TEAM_CHECK"));
			}
		//6. 자원해제
			rset.close();
			stmt.close();
			conn.close();
		//	stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return team;
}

public int insertMember(Team team) {
		
	String sql = "INSERT INTO TEAM_TBL VALUES('"+team.getTeamName()+"', '"+team.getTeamFirstScore()+"', '"+team.getTeamSecondScore()+"','"+team.getTeamThirdScore()+"','"+team.getTeamGoal()+"','"+team.getTeamCheck()+"')";
			
	int result = 0;
	try {
	Class.forName(DRIVER_NAME);
	Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
	Statement stmt = conn.createStatement();
	result = stmt.executeUpdate(sql);
	stmt.close();
	conn.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
}
public int updateTeam(Team team) {
	int result = 0;
	String sql = "UPDATE TEAM_TBL SET TEAM_FIRST_SCORE = '"+team.getTeamFirstScore()+"', TEAM_SECOND_SCORE = '"+team.getTeamSecondScore()+"',"+ "TEAM_THIRD_SCORE = '"+team.getTeamThirdScore()+"',"+" TEAM_GOAL = '"+team.getTeamGoal()+"',"+" TEAM_CHECK = '"+team.getTeamCheck()+"'";
	try {
		Class.forName(DRIVER_NAME);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stmt = conn.createStatement();
		result = stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
}
public int deleteTeam(String teamName) {
	int result = 0;
	String sql = "DELETE FROM TEAM_TBL WHERE TEAM_NAME = '"+teamName+"'";
	try {
		Class.forName(DRIVER_NAME);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		Statement stmt = conn.createStatement();
		result = stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return result;
}

	
}


