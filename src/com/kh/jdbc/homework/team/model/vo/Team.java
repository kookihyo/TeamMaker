package com.kh.jdbc.homework.team.model.vo;

public class Team {
	private String teamName;
	private int teamFirstScore;
	private int teamSecondScore;
	private int teamThirdScore;
	private int teamGoal;
	private String TeamCheck;


	public Team() {}
	
			
	public Team(String teamName, int teamFirstScore, int teamSecondScore, int teamThirdScore, int teamGoal,
			String teamCheck) {
		super();
		this.teamName = teamName;
		this.teamFirstScore = teamFirstScore;
		this.teamSecondScore = teamSecondScore;
		this.teamThirdScore = teamThirdScore;
		this.teamGoal = teamGoal;
		this.TeamCheck = teamCheck;
	}


	public Team(String teamName) {
		this.teamName = teamName;
	}

	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamFirstScore() {
		return teamFirstScore;
	}

	public void setTeamFirstScore(int teamFirstScore) {
		this.teamFirstScore = teamFirstScore;
	}

	public int getTeamSecondScore() {
		return teamSecondScore;
	}

	public void setTeamSecondScore(int teamSecondScore) {
		this.teamSecondScore = teamSecondScore;
	}

	public int getTeamThirdScore() {
		return teamThirdScore;
	}

	public void setTeamThirdScore(int teamThirdScore) {
		this.teamThirdScore = teamThirdScore;
	}

	public int getTeamGoal() {
		return teamGoal;
	}

	public void setTeamGoal(int teamGoal) {
		this.teamGoal = teamGoal;
	}

	public String getTeamCheck() {
		return TeamCheck;
	}

	public void setTeamCheck(String teamCheck) {
		TeamCheck = teamCheck;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamFirstScore=" + teamFirstScore + ", teamSecondScore="
				+ teamSecondScore + ", teamThirdScore=" + teamThirdScore + ", teamGoal=" + teamGoal + ", TeamCheck="
				+ TeamCheck + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}