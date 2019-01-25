package com.revature.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		VisitorTicketTracker trackerOne = VisitorTicketTracker.getInstance();
		VisitorTicketTracker trackerTwo = VisitorTicketTracker.getInstance();
		if(trackerOne == trackerTwo) {
			System.out.println("all is right in the world!");
		}else {
			System.out.println("Trump is president!!!");
		}
		
		System.out.println("TrackerOne numTickets " + trackerOne.countTickets());
		System.out.println("TrackerTwo numTickets " + trackerTwo.countTickets());
		System.out.println("issue a ticket");
		trackerOne.issueTicket();
		System.out.println("TrackerOne numTickets " + trackerOne.countTickets());
		System.out.println("TrackerTwo numTickets " + trackerTwo.countTickets());
			
	}
}
