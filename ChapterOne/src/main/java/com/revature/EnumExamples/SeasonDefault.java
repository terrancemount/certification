package com.revature.EnumExamples;

public enum SeasonDefault {
	WINTER {public void printHours() {System.out.println("10am-3pm");}},
	SPRING,
	SUMMER {public void printHours() {System.out.println("9am-7pm");}},
	FALL;
	public void printHours() {System.out.println("9am-5pm");}
}
