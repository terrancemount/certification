package com.revature.EnumExamples;

import org.apache.log4j.Logger;

public class SeasonTests {
	private static Logger LOGGER = Logger.getLogger(SeasonTests.class);
	public static void main(String[] args) {
		testSeason();
		testSeasonConstructor();
		testSeasonDefault();
	}
	
	
	public static void testSeason() {
		LOGGER.trace("testSeason()");
		
		Season season = Season.SUMMER;
		
		switch(season) {
		case WINTER:
			System.out.println("It is cold");
			break;
		case SPRING:
			System.out.println("Smell the flowers");
			break;
		case SUMMER:
			System.out.println("It is getting hot in here!");
			break;
		case FALL:
			System.out.println("Winter is comming!!!");
			break;
		default:
			throw new IllegalArgumentException("Not supported Season Enum");
		}
	}
	
	public static void testSeasonConstructor() {
		LOGGER.trace("testSeasonConstructor()");
		SeasonConstructor season = SeasonConstructor.SPRING;
		
		switch(season) {
		case WINTER:
			System.out.println("It is cold");
			season.printExpectedVisitors();
			break;
		case SPRING:
			System.out.println("Smell the flowers");
			season.printExpectedVisitors();
			break;
		case SUMMER:
			System.out.println("It is getting hot in here!");
			season.printExpectedVisitors();
			break;
		case FALL:
			System.out.println("Winter is comming!!!");
			season.printExpectedVisitors();
			break;
		default:
			throw new IllegalArgumentException("Not supported Season Enum");
		}
	}
	public static void testSeasonDefault() {
		LOGGER.trace("testSeasonDefault()");
		SeasonDefault season = SeasonDefault.SPRING;
		
		switch(season) {
		case WINTER:
			System.out.println("It is cold");
			season.printHours();
			break;
		case SPRING:
			System.out.println("Smell the flowers");
			season.printHours();
			break;
		case SUMMER:
			System.out.println("It is getting hot in here!");
			season.printHours();
			break;
		case FALL:
			System.out.println("Winter is comming!!!");
			season.printHours();
			break;
		default:
			throw new IllegalArgumentException("Not supported Season Enum");
		}
	}
}
