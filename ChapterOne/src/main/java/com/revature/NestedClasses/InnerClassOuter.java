package com.revature.NestedClasses;

public class InnerClassOuter {
	private String greeting = "Hi";
	
	protected class Inner{
		public int repeat = 3;
		public void go() {
			for(int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		new Inner().go();
	}
	
	public static void main(String[] args) {
		new InnerClassOuter().callInner();
	}
}
