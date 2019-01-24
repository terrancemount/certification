package com.revature.EnumExamples;

public enum SeasonAbstract {
	WINTER {public void printHours() {System.out.println("10am-3pm");}},
	SPRING {public void printHours() {System.out.println("9am-5pm");}},
	SUMMER {public void printHours() {System.out.println("9am-7pm");}},
	FALL {public void printHours() {System.out.println("9am-5pm");}};
	public abstract void printHours();
}
