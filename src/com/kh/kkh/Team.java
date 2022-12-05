package com.kh.kkh;

public class Team {
	private String name;
	private int firstScore;
	private int secondScore;
	private int thirdScore;

	public Team() {}
	
	public Team(String name, int firstScore, int secondScore, int thirdScore) {
		this.name = name;
	}
	public Team(int firstScore, int secondScore,int thirdScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}
	
	//getter 메소드
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	public int getThirdScore() {
		return this.thirdScore;
	}
	
	//setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore =secondScore;
	}
	public void setThirdScore(int thirdScore) {
		this.thirdScore =thirdScore;
	}
}
