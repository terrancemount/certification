package com.revature.EnumExamples;

public enum SeasonConstructor {
	WINTER("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");
	private String expectedVisitors;
	private SeasonConstructor(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
