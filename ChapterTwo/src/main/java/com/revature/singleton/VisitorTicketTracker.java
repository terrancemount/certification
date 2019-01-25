/**
 * VisitorTicketTracker that uses lazy loading to 
 * getInstance with a Double Check locking.
 * 
 * If the first time the getInstance is called then
 * instances will be null.  Then the synchronized lock
 * is put on the class.  Then it checks if the
 * instance is still null. This is because will 
 * one thread is waiting for the synchronized lock
 * another might be creating instance.  Only once the
 * lock is in place and instance is still
 * null then a new instance of VistitorTicketTracker is 
 * made then the lock is released and instance is returned.
 * 
 * This allows the ticket tracker to normally be 
 * non-synchronized over a long program run with lots
 * of thread the pull from this singleton, which will
 * increase speed.
 * 
 * Other option will be to have the getInstance method
 * be synchronized which will do the same thing but
 * every time the method it is call a synchronized lock
 * will be made, slowing up processing.
 * 
 * Other ways is to make the instance field final but this
 * prevents lazy loading.  Only want to create the instance
 * if one is called for.  With final field set in-line or 
 * with a static block, it will always be created if the
 * class is ever accessed.  Problem if the class has other 
 * useful static methods.  
 */

package com.revature.singleton;

public class VisitorTicketTracker {
	//use volatile to prevent compiler from optimizing
	//this variable. Might try to read before it is initialized.
	private static volatile VisitorTicketTracker instance;
	private int numTickets;
	
	//all constructors are private making effectively final.
	private VisitorTicketTracker() {
		this.numTickets = 10;
	}
	
	//lazey loaded getInstance with double check locking
	public static VisitorTicketTracker getInstance() {
		if(instance == null) {
			synchronized (VisitorTicketTracker.class) {
				if(instance == null) {
					instance = new VisitorTicketTracker();
				}
				
			}
		}
		return instance;
	}
	//used synchronized here because several threads might be trying
	//to add tickets at once.
	public synchronized void addTickets(int numTickets) {
		if(numTickets < 0) {
			throw new IllegalArgumentException("Must have positive number"
					+ " of tickets to add.");
		}
		this.numTickets += numTickets;
	}
	
	//simply remove a ticket and give to customer.
	public synchronized void issueTicket() {
		this.numTickets--;
		checkIfNeedAnotherRollOfTickets();
	}
	
	//simple count tickes
	public synchronized int countTickets() {
		return this.numTickets;
	}
	
	//non synchronized but will do Double check locking
	public void checkIfNeedAnotherRollOfTickets() {
		if(numTickets < 10) {
			synchronized (VisitorTicketTracker.class) {
				if(numTickets < 10) {
					numTickets += 100;
				}
			}
		}
	}
	
}
