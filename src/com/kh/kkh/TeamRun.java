package com.kh.kkh;

public class TeamRun {
	public static void main(String [] args) {
		TeamFunction tFunc = new TeamFunction();
		EXIT:
			while(true) {
				int choice = tFunc.printMenu();
				switch(choice) {
				case 1:
					tFunc.inputScore();
					break;
				case 2:
					tFunc.printScore();
					break;
				case 3:
					tFunc.checkPass();
					break;
				case 4: break EXIT;
				default : break;
				}
			}
	}
}
